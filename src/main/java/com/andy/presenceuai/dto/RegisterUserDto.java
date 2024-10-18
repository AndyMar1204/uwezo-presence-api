package com.andy.presenceuai.dto;

import com.andy.presenceuai.models.Role;
import lombok.Data;

@Data
public class RegisterUserDto {
    private String email;
    private String password;
    private String name;
    private Role role;
}
