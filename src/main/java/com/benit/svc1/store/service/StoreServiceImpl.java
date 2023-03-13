package com.benit.svc1.store.service;

import com.benit.svc1.store.dto.StoreDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class StoreServiceImpl implements StoreService {

    /**
     * 입점된 가게목록 가져오기
     * @return
     */
    @Override
    public List<StoreDTO> getStores() {

        List<StoreDTO> resultList = new ArrayList<>();

        resultList.add(
            StoreDTO.builder()
                    .name("BHC치킨")
                    .tel("02-1111-2222")
                    .category("한식")
                    .isOpen(true)
                    .build()
        );

        resultList.add(
                StoreDTO.builder()
                        .name("베스킨라빈스")
                        .tel("02-7777-1111")
                        .category("디저트")
                        .isOpen(false)
                        .build()
        );

        log.info("가게목록 : {}", resultList);

        return resultList;
    }

}
