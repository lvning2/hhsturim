package rebotstudio.hhsturim.service;

import org.springframework.stereotype.Service;
import rebotstudio.hhsturim.entity.Contract;

import java.util.List;

@Service
public interface ContractService {  //合同

    Contract getContractById(Integer id);   //根据合同号查询合同信息.

    List getContractByUserId(Integer userId);   //根据用户id获取所有的合同

    void deleteContractById(Integer id);        //根据合同的id删除合同



}
