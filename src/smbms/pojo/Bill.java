package smbms.pojo;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity Class Bill
 *
 * 2014-12-06
 */
public class Bill {

    
    private Integer id;
    
    private String billcode;
    
    private String productname;
    
    private String productdesc;
    
    private String productunit;
    
    private BigDecimal productcount;
    
    private BigDecimal totalprice;
    
    private Integer ispayment;
    
    private Integer createdby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationdate;
    
    private Integer modifyby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifydate;
    
    private Integer providerid;

    public Bill(){
    }

    public Bill(Integer id, String billcode, String productname, String productdesc, String productunit, BigDecimal productcount, BigDecimal totalprice, Integer ispayment, Integer createdby, Date creationdate, Integer modifyby, Date modifydate, Integer providerid){
        this.id = id;
        this.billcode = billcode;
        this.productname = productname;
        this.productdesc = productdesc;
        this.productunit = productunit;
        this.productcount = productcount;
        this.totalprice = totalprice;
        this.ispayment = ispayment;
        this.createdby = createdby;
        this.creationdate = creationdate;
        this.modifyby = modifyby;
        this.modifydate = modifydate;
        this.providerid = providerid;
    }


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setBillcode(String billcode){
        this.billcode = billcode;
    }

    public String getBillcode(){
        return billcode;
    }

    public void setProductname(String productname){
        this.productname = productname;
    }

    public String getProductname(){
        return productname;
    }

    public void setProductdesc(String productdesc){
        this.productdesc = productdesc;
    }

    public String getProductdesc(){
        return productdesc;
    }

    public void setProductunit(String productunit){
        this.productunit = productunit;
    }

    public String getProductunit(){
        return productunit;
    }

    public void setProductcount(BigDecimal productcount){
        this.productcount = productcount;
    }

    public BigDecimal getProductcount(){
        return productcount;
    }

    public void setTotalprice(BigDecimal totalprice){
        this.totalprice = totalprice;
    }

    public BigDecimal getTotalprice(){
        return totalprice;
    }

    public void setIspayment(Integer ispayment){
        this.ispayment = ispayment;
    }

    public Integer getIspayment(){
        return ispayment;
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

    public void setProviderid(Integer providerid){
        this.providerid = providerid;
    }

    public Integer getProviderid(){
        return providerid;
    }
}
