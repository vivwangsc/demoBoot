package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "sys_dictionary")
public class SysDictionaryEntity implements Serializable {

private static final long serialVersionUID = 1L;

			
    // 系统字典表
							
	    @Id
			private String id;
			
	    @Column(name = "version")
		    @Version
		private Integer version;
			
	    @Column(name = "extInfo")
			private String extInfo;
			
	    @Column(name = "code")
			private String code;
			
	    @Column(name = "levelCode")
			private String levelCode;
			
	    @Column(name = "name")
			private String name;
			
	    @Column(name = "remark")
			private String remark;
			
	    @Column(name = "value")
			private String value;
		
    // 简码
		
	    @Column(name = "easyCode")
			private String easyCode;

					
    public String getId() {
            return id;
            }

		        public void setId(String id) {
		            this.id = id;
		            }
					
    public Integer getVersion() {
            return version;
            }

		        public void setVersion(Integer version) {
		            this.version = version;
		            }
					
    public String getExtInfo() {
            return extInfo;
            }

		        public void setExtInfo(String extInfo) {
		            this.extInfo = extInfo;
		            }
					
    public String getCode() {
            return code;
            }

		        public void setCode(String code) {
		            this.code = code;
		            }
					
    public String getLevelCode() {
            return levelCode;
            }

		        public void setLevelCode(String levelCode) {
		            this.levelCode = levelCode;
		            }
					
    public String getName() {
            return name;
            }

		        public void setName(String name) {
		            this.name = name;
		            }
					
    public String getRemark() {
            return remark;
            }

		        public void setRemark(String remark) {
		            this.remark = remark;
		            }
					
    public String getValue() {
            return value;
            }

		        public void setValue(String value) {
		            this.value = value;
		            }
					
    public String getEasyCode() {
            return easyCode;
            }

		        public void setEasyCode(String easyCode) {
		            this.easyCode = easyCode;
		            }
	
@Override
public String toString() {
        return "SysDictionaryEntity{" +
			                "id=" + id +
					                ", version=" + version +
					                ", extInfo=" + extInfo +
					                ", code=" + code +
					                ", levelCode=" + levelCode +
					                ", name=" + name +
					                ", remark=" + remark +
					                ", value=" + value +
					                ", easyCode=" + easyCode +
			        "}";
        }
        }
