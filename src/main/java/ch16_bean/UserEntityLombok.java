package ch16_bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}