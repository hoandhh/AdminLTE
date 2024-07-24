package com.hoandhh.adminlte.services;

import com.hoandhh.adminlte.models.CustomUserDetails;
import com.hoandhh.adminlte.models.User;
import com.hoandhh.adminlte.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomDetailService implements UserDetailsService {


    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        Collection<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        Set<UserRole> roles = user.getUserRoles();

        for (UserRole role: roles) {
            grantedAuthoritySet.add(new SimpleGrantedAuthority(role.getRole().getName()));
        }

        return new CustomUserDetails(user, grantedAuthoritySet);
    }
}
