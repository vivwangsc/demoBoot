package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "doc_file")
public class DocFileEntity implements Serializable {

private static final long serialVersionUID = 1L;

									
	    @Id
			private String id;
			    //@TableField("create_date_time")
	
	    @Column(name = "create_date_time")
			private Date createDateTime;
			
	    @Column(name = "deleted")
			private Integer deleted;
			    //@TableField("update_date_time")
	
	    @Column(name = "update_date_time")
			private Date updateDateTime;
			
	    @Column(name = "version")
		    @Version
		private Integer version;
			    //@TableField("create_user_id")
	
	    @Column(name = "create_user_id")
			private String createUserId;
			
	    @Column(name = "fileName")
			private String fileName;
			
	    @Column(name = "filePath")
			private String filePath;
			
	    @Column(name = "fileSize")
			private Long fileSize;
			    //@TableField("form_ID")
	
	    @Column(name = "form_ID")
			private String formID;
			
	    @Column(name = "savedName")
			private String savedName;

					
    public String getId() {
            return id;
            }

		        public void setId(String id) {
		            this.id = id;
		            }
					
    public Date getCreateDateTime() {
            return createDateTime;
            }

		        public void setCreateDateTime(Date createDateTime) {
		            this.createDateTime = createDateTime;
		            }
					
    public Integer getDeleted() {
            return deleted;
            }

		        public void setDeleted(Integer deleted) {
		            this.deleted = deleted;
		            }
					
    public Date getUpdateDateTime() {
            return updateDateTime;
            }

		        public void setUpdateDateTime(Date updateDateTime) {
		            this.updateDateTime = updateDateTime;
		            }
					
    public Integer getVersion() {
            return version;
            }

		        public void setVersion(Integer version) {
		            this.version = version;
		            }
					
    public String getCreateUserId() {
            return createUserId;
            }

		        public void setCreateUserId(String createUserId) {
		            this.createUserId = createUserId;
		            }
					
    public String getFileName() {
            return fileName;
            }

		        public void setFileName(String fileName) {
		            this.fileName = fileName;
		            }
					
    public String getFilePath() {
            return filePath;
            }

		        public void setFilePath(String filePath) {
		            this.filePath = filePath;
		            }
					
    public Long getFileSize() {
            return fileSize;
            }

		        public void setFileSize(Long fileSize) {
		            this.fileSize = fileSize;
		            }
					
    public String getFormID() {
            return formID;
            }

		        public void setFormID(String formID) {
		            this.formID = formID;
		            }
					
    public String getSavedName() {
            return savedName;
            }

		        public void setSavedName(String savedName) {
		            this.savedName = savedName;
		            }
	
@Override
public String toString() {
        return "DocFileEntity{" +
			                "id=" + id +
					                ", createDateTime=" + createDateTime +
					                ", deleted=" + deleted +
					                ", updateDateTime=" + updateDateTime +
					                ", version=" + version +
					                ", createUserId=" + createUserId +
					                ", fileName=" + fileName +
					                ", filePath=" + filePath +
					                ", fileSize=" + fileSize +
					                ", formID=" + formID +
					                ", savedName=" + savedName +
			        "}";
        }
        }
