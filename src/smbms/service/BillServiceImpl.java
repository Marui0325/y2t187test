package smbms.service;

import smbms.pojo.Bill;
import smbms.dao.BillMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Service Class Bill
*
* 2014-12-06
*/

@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Resource
    private BillMapper billMapper;

    @Transactional(readOnly = true)
    public Bill getBillById(Integer id)throws Exception{
        return billMapper.getBillById(id);
    }

    @Transactional(readOnly = true)
    public List<Bill> getBillListByMap(Map<String,Object> param)throws Exception {
        return billMapper.getBillListByMap(param);
    }
    
    @Transactional(readOnly = true)
    public Integer getBillRecCountByMap(Map<String,Object> param)throws Exception {
    	return billMapper.getBillRecordCount(param);
    }
    

    public Integer insertBill(Bill bill)throws Exception {
        return billMapper.insertBill(bill);
    }

    public Integer updateBill(Bill bill)throws Exception {
        return billMapper.updateBill(bill);
    }

    public Integer deleteBillById(Integer id)throws Exception {
        return billMapper.deleteBillById(id);
    }

}