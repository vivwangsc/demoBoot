package com.example.demo.bluewise.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Data
@Entity
@Table(name = "sys_department")
public class SysDepartmentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id;

    // 姓名
    @Column(name = "name")
    private String name;

    // 姓名
    @Column(name = "level_code")
    private String levelCode;

}
