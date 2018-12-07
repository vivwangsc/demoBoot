package com.example.demo.bluewise.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Entity
@Table(name = "sys_role")
public class SysRoleEntity implements Serializable {

private static final long serialVersionUID = 1L;

			
    // 主键
							
	    @Id
			private String id;
			
	    @Column(name = "version")
		    @Version
		private Integer version;
		
    // 角色名称
		
	    @Column(name = "roleName")
			private String roleName;
		
    // 角色描述
		
	    @Column(name = "roleDesc")
			private String roleDesc;
			    //@TableField("sys_rolecol")
	
	    @Column(name = "sys_rolecol")
			private String sysRolecol;
			
	    @Column(name = "roleRights")
			private String roleRights;

					
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
					
    public String getRoleName() {
            return roleName;
            }

		        public void setRoleName(String roleName) {
		            this.roleName = roleName;
		            }
					
    public String getRoleDesc() {
            return roleDesc;
            }

		        public void setRoleDesc(String roleDesc) {
		            this.roleDesc = roleDesc;
		            }
					
    public String getSysRolecol() {
            return sysRolecol;
            }

		        public void setSysRolecol(String sysRolecol) {
		            this.sysRolecol = sysRolecol;
		            }
					
    public String getRoleRights() {
            return roleRights;
            }

		        public void setRoleRights(String roleRights) {
		            this.roleRights = roleRights;
		            }
	
@Override
public String toString() {
        return "SysRoleEntity{" +
			                "id=" + id +
					                ", version=" + version +
					                ", roleName=" + roleName +
					                ", roleDesc=" + roleDesc +
					                ", sysRolecol=" + sysRolecol +
					                ", roleRights=" + roleRights +
			        "}";
        }
        }
