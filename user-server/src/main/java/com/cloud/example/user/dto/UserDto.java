package com.cloud.example.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/***
 * user Dto
 */
@Data
@NoArgsConstructor
public class UserDto implements Serializable {
    private static final long serialVersionUID = -256057783952466348L;
    private String id;
    private String name;
    private String address;
    private String phone;

}
