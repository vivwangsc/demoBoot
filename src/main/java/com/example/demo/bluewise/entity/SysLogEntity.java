package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "sys_log")
public class SysLogEntity implements Serializable {

private static final long serialVersionUID = 1L;

			
    // 主键
							
	    @Id
			private String id;
		
    // 用户
		
	    @Column(name = "userName")
			private String userName;
		
    // 日志
		
	    @Column(name = "title")
			private String title;
		
    // 地址
		
	    @Column(name = "url")
			private String url;
		
    // 参数
		
	    @Column(name = "params")
			private String params;
		
    // 日志时间
		
	    @Column(name = "createTime")
			private Date createTime;

					
    public String getId() {
            return id;
            }

		        public void setId(String id) {
		            this.id = id;
		            }
					
    public String getUserName() {
            return userName;
            }

		        public void setUserName(String userName) {
		            this.userName = userName;
		            }
					
    public String getTitle() {
            return title;
            }

		        public void setTitle(String title) {
		            this.title = title;
		            }
					
    public String getUrl() {
            return url;
            }

		        public void setUrl(String url) {
		            this.url = url;
		            }
					
    public String getParams() {
            return params;
            }

		        public void setParams(String params) {
		            this.params = params;
		            }
					
    public Date getCreateTime() {
            return createTime;
            }

		        public void setCreateTime(Date createTime) {
		            this.createTime = createTime;
		            }
	
@Override
public String toString() {
        return "SysLogEntity{" +
			                "id=" + id +
					                ", userName=" + userName +
					                ", title=" + title +
					                ", url=" + url +
					                ", params=" + params +
					                ", createTime=" + createTime +
			        "}";
        }
        }
