package com.ejemplo;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public final NotificationService miService;

    public UserService(NotificationService servicio) {
        this.miService = servicio;
    }
}
