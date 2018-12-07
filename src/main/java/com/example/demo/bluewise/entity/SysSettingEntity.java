package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * 系统设置表
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "sys_setting")
public class SysSettingEntity implements Serializable {

private static final long serialVersionUID = 1L;

			
    // 主键
							
	    @Id
			private String id;
		
    // KEY
		
	    @Column(name = "sysKey")
			private String sysKey;
		
    // 名称
		
	    @Column(name = "sysName")
			private String sysName;
		
    // 值
		
	    @Column(name = "sysValue")
			private String sysValue;
		
    // 排序
		
	    @Column(name = "sort")
			private Integer sort;
		
    // 说明
		
	    @Column(name = "sysDesc")
			private String sysDesc;

					
    public String getId() {
            return id;
            }

		        public void setId(String id) {
		            this.id = id;
		            }
					
    public String getSysKey() {
            return sysKey;
            }

		        public void setSysKey(String sysKey) {
		            this.sysKey = sysKey;
		            }
					
    public String getSysName() {
            return sysName;
            }

		        public void setSysName(String sysName) {
		            this.sysName = sysName;
		            }
					
    public String getSysValue() {
            return sysValue;
            }

		        public void setSysValue(String sysValue) {
		            this.sysValue = sysValue;
		            }
					
    public Integer getSort() {
            return sort;
            }

		        public void setSort(Integer sort) {
		            this.sort = sort;
		            }
					
    public String getSysDesc() {
            return sysDesc;
            }

		        public void setSysDesc(String sysDesc) {
		            this.sysDesc = sysDesc;
		            }
	
@Override
public String toString() {
        return "SysSettingEntity{" +
			                "id=" + id +
					                ", sysKey=" + sysKey +
					                ", sysName=" + sysName +
					                ", sysValue=" + sysValue +
					                ", sort=" + sort +
					                ", sysDesc=" + sysDesc +
			        "}";
        }
        }
