package com.example.demo.bluewise.service;

import com.example.demo.bluewise.entity.SysDatalogEntity;
import com.example.demo.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 数据变动日志表 服务类
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */
@Repository
public interface ISysDatalogService extends BaseRepository<SysDatalogEntity> {

}
