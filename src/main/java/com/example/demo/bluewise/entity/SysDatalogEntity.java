package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * 数据变动日志表
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "sys_datalog")
public class SysDatalogEntity implements Serializable {

private static final long serialVersionUID = 1L;


    // 主键
							
	    @Id
			private String id;
		
    // 用户
		
	    @Column(name = "userId")
			private String userId;
		
    // 操作的表
		
	    @Column(name = "tableName")
			private String tableName;
		
    // 操作时间
		
	    @Column(name = "operateTime")
			private String operateTime;
		
    // 变动后数据
		
	    @Column(name = "changedData")
			private String changedData;

					
    public String getId() {
            return id;
            }

		        public void setId(String id) {
		            this.id = id;
		            }
					
    public String getUserId() {
            return userId;
            }

		        public void setUserId(String userId) {
		            this.userId = userId;
		            }
					
    public String getTableName() {
            return tableName;
            }

		        public void setTableName(String tableName) {
		            this.tableName = tableName;
		            }
					
    public String getOperateTime() {
            return operateTime;
            }

		        public void setOperateTime(String operateTime) {
		            this.operateTime = operateTime;
		            }
					
    public String getChangedData() {
            return changedData;
            }

		        public void setChangedData(String changedData) {
		            this.changedData = changedData;
		            }
	
@Override
public String toString() {
        return "SysDatalogEntity{" +
			                "id=" + id +
					                ", userId=" + userId +
					                ", tableName=" + tableName +
					                ", operateTime=" + operateTime +
					                ", changedData=" + changedData +
			        "}";
        }
        }
