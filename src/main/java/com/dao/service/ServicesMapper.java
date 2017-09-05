package com.dao.service;

import com.entity.service.Services;

public interface ServicesMapper {
    int deleteByPrimaryKey(Integer sSeId);

    int insert(Services record);

    int insertSelective(Services record);

    Services selectByPrimaryKey(Integer sSeId);

    int updateByPrimaryKeySelective(Services record);

    int updateByPrimaryKey(Services record);
}