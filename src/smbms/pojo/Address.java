package smbms.pojo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity Class Address
 *
 * 2014-12-06
 */
public class Address {

    private Integer id;
    
    private String contact;
    
    private String addressdesc;
    
    private String postcode;
    
    private String tel;
    
    private Integer createdby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationdate;
    
    private Integer modifyby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifydate;
    
    private Integer userid;

    public Address(){
    }

    public Address(Integer id, String contact, String addressdesc, String postcode, String tel, Integer createdby, Date creationdate, Integer modifyby, Date modifydate, Integer userid){
        this.id = id;
        this.contact = contact;
        this.addressdesc = addressdesc;
        this.postcode = postcode;
        this.tel = tel;
        this.createdby = createdby;
        this.creationdate = creationdate;
        this.modifyby = modifyby;
        this.modifydate = modifydate;
        this.userid = userid;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return contact;
    }

    public void setAddressdesc(String addressdesc){
        this.addressdesc = addressdesc;
    }

    public String getAddressdesc(){
        return addressdesc;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }

    public String getPostcode(){
        return postcode;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getTel(){
        return tel;
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

    public void setUserid(Integer userid){
        this.userid = userid;
    }

    public Integer getUserid(){
        return userid;
    }
}
