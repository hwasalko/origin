package com.benit.svc1.store.service;

import com.benit.svc1.store.dto.StoreDTO;

import java.util.List;



public interface StoreService {

    /**
     * 입점된 가게목록 가져오기
     * @return
     */
    public List<StoreDTO> getStores();

}
