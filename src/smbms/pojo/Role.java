package smbms.pojo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity Class Role
 *
 * 2014-12-06
 */
public class Role {

    
    private Integer id;
    
    private String rolecode;
    
    private String rolename;
    
    private Integer createdby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationdate;
    
    private Integer modifyby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifydate;

    public Role(){
    }

    public Role(Integer id, String rolecode, String rolename, Integer createdby, Date creationdate, Integer modifyby, Date modifydate){
        this.id = id;
        this.rolecode = rolecode;
        this.rolename = rolename;
        this.createdby = createdby;
        this.creationdate = creationdate;
        this.modifyby = modifyby;
        this.modifydate = modifydate;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setRolecode(String rolecode){
        this.rolecode = rolecode;
    }

    public String getRolecode(){
        return rolecode;
    }

    public void setRolename(String rolename){
        this.rolename = rolename;
    }

    public String getRolename(){
        return rolename;
    }

    public void setCreatedby(Integer createdby){
        this.createdby = createdby;
    }

    public Integer getCreatedby(){
        return createdby;
    }

    public void setCreationdate(Date creationdate){
        this.creationdate = creationdate;
    }

    public Date getCreationdate(){
        return creationdate;
    }

    public void setModifyby(Integer modifyby){
        this.modifyby = modifyby;
    }

    public Integer getModifyby(){
        return modifyby;
    }

    public void setModifydate(Date modifydate){
        this.modifydate = modifydate;
    }

    public Date getModifydate(){
        return modifydate;
    }
}
