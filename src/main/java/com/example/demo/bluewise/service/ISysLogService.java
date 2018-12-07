package com.example.demo.bluewise.service;

import com.example.demo.bluewise.entity.SysLogEntity;
import com.example.demo.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */
@Repository
public interface ISysLogService extends BaseRepository<SysLogEntity> {

}
