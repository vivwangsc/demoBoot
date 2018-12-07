package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王顺初
 * @since 2017-12-27
 */

@Entity
@Table(name = "oa_bxd")
public class OaBxdEntity implements Serializable {

private static final long serialVersionUID = 1L;

									
	    @Id
			private String id;
			
	    @Column(name = "version")
		    @Version
		private Integer version;
			
	    @Column(name = "qjr")
			private String qjr;
			
	    @Column(name = "qjsj")
			private String qjsj;
			
	    @Column(name = "qjyy")
			private String qjyy;
			
	    @Column(name = "zt")
			private String zt;
			
	    @Column(name = "bz")
			private String bz;

					
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
					
    public String getQjr() {
            return qjr;
            }

		        public void setQjr(String qjr) {
		            this.qjr = qjr;
		            }
					
    public String getQjsj() {
            return qjsj;
            }

		        public void setQjsj(String qjsj) {
		            this.qjsj = qjsj;
		            }
					
    public String getQjyy() {
            return qjyy;
            }

		        public void setQjyy(String qjyy) {
		            this.qjyy = qjyy;
		            }
					
    public String getZt() {
            return zt;
            }

		        public void setZt(String zt) {
		            this.zt = zt;
		            }
					
    public String getBz() {
            return bz;
            }

		        public void setBz(String bz) {
		            this.bz = bz;
		            }
	
@Override
public String toString() {
        return "OaBxdEntity{" +
			                "id=" + id +
					                ", version=" + version +
					                ", qjr=" + qjr +
					                ", qjsj=" + qjsj +
					                ", qjyy=" + qjyy +
					                ", zt=" + zt +
					                ", bz=" + bz +
			        "}";
        }
        }
