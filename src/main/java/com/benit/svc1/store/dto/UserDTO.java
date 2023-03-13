package com.benit.svc1.store.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
public class UserDTO {

    String name;            // 이름
    String phoneNumber;     // 핸드폰번호
    String address;         // 주소
    int age;                // 나이

}
