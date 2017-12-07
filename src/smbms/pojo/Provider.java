package smbms.pojo;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity Class Provider
 *
 * 2014-12-06
 */
public class Provider {

    
    private Integer id;
    
    private String procode;
    
    private String proname;
    
    private String prodesc;
    
    private String procontact;
    
    private String prophone;
    
    private String proaddress;
    
    private String profax;
    
    private Integer createdby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifydate;
    
    private Integer modifyby;

    public Provider(){
    }

    public Provider(Integer id, String procode, String proname, String prodesc, String procontact, String prophone, String proaddress, String profax, Integer createdby, Date creationdate, Date modifydate, Integer modifyby){
        this.id = id;
        this.procode = procode;
        this.proname = proname;
        this.prodesc = prodesc;
        this.procontact = procontact;
        this.prophone = prophone;
        this.proaddress = proaddress;
        this.profax = profax;
        this.createdby = createdby;
        this.creationdate = creationdate;
        this.modifydate = modifydate;
        this.modifyby = modifyby;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setProcode(String procode){
        this.procode = procode;
    }

    public String getProcode(){
        return procode;
    }

    public void setProname(String proname){
        this.proname = proname;
    }

    public String getProname(){
        return proname;
    }

    public void setProdesc(String prodesc){
        this.prodesc = prodesc;
    }

    public String getProdesc(){
        return prodesc;
    }

    public void setProcontact(String procontact){
        this.procontact = procontact;
    }

    public String getProcontact(){
        return procontact;
    }

    public void setProphone(String prophone){
        this.prophone = prophone;
    }

    public String getProphone(){
        return prophone;
    }

    public void setProaddress(String proaddress){
        this.proaddress = proaddress;
    }

    public String getProaddress(){
        return proaddress;
    }

    public void setProfax(String profax){
        this.profax = profax;
    }

    public String getProfax(){
        return profax;
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

    public void setModifydate(Date modifydate){
        this.modifydate = modifydate;
    }

    public Date getModifydate(){
        return modifydate;
    }

    public void setModifyby(Integer modifyby){
        this.modifyby = modifyby;
    }

    public Integer getModifyby(){
        return modifyby;
    }
}
