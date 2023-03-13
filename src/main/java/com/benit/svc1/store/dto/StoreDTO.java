package com.benit.svc1.store.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
public class StoreDTO {

    String name;        // 가게명
    String tel;         // 전화번호
    String category;    // 한식,중식,일식,양식 등 종류
    boolean isOpen;     // 가게 open/close

}
