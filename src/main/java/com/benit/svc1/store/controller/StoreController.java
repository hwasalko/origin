package com.benit.svc1.store.controller;

import com.benit.svc1.store.dto.StoreDTO;
import com.benit.svc1.store.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
public class StoreController {

    @Autowired
    private StoreService storeService; // 서비스 빈(bean) 자동주입


    /**
     * 가게(Store) 목록 제공 컨트롤러
     * @return
     */
    @GetMapping("/stores")
    public List<StoreDTO> stores(){

        // 1. 가게목록 가져오기
        var storeList = storeService.getStores();

        // 2. 로그출력(배열이기 때문에 Stream API 통한 다중행 로그출력)
        storeList.forEach( storeDTO -> log.info("- {}", storeDTO) );

        // 3. 리턴
        return storeList;

    }

}
