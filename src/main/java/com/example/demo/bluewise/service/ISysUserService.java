package com.example.demo.bluewise.service;

import com.example.demo.bluewise.entity.SysUserEntity;
import com.example.demo.common.dao.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */
@Repository
public interface ISysUserService extends BaseRepository<SysUserEntity> {


}
