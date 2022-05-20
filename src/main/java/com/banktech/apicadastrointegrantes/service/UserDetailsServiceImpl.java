package com.banktech.apicadastrointegrantes.service;

import com.banktech.apicadastrointegrantes.model.UserModel;
import com.banktech.apicadastrointegrantes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository repository;


    @Override
    @Transactional
    public UserDetails loadUserByLogin(String login) throws UsernameNotFoundException{
        UserModel usuario = repository.findbyLogin(login);
        if ( usuario != null){
           SimpleGrantedAuthority authority = new SimpleGrantedAuthority(usuario).getRole()));
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);
        User user = new User(usuario.getLogin(), usuario.getSenha(), authorities);
        return user;
        }
        return null;
    }
}
