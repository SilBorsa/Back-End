package com.miPortfolio.spb.security.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPpal implements UserDetails {
    private String nombre;
    private String nombreUsuario;
    private String emailUsuario;
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    //contructor para todos los campos
    public UsuarioPpal(String nombre, String nombreUsuario, String emailUsuario, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.password = password;
        this.authorities = authorities;
    }

    //metodo para construir
    public static UsuarioPpal build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPpal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmailUsuario(), usuario.getPassword(), authorities);

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    public String getEmail() {
        return emailUsuario;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
