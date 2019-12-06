package rebotstudio.hhsturim.service.impl;

import org.springframework.stereotype.Service;
import rebotstudio.hhsturim.entity.Contract;
import rebotstudio.hhsturim.mapper.ContractMapper;
import rebotstudio.hhsturim.service.ContractService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContractServiceImpl  implements ContractService {

    @Resource
    private ContractMapper contractMapper;



    @Override
    public Contract getContractById(Integer id) {       //根据合同号查询合同信息.
         return contractMapper.selectByPrimaryKey(id);
    }

    @Override
    public List getContractByUserId(Integer userId) {


        return null;
    }

    @Override
    public void deleteContractById(Integer id) {


    }
}
