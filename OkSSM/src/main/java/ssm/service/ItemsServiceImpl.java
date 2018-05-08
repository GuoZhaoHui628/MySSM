package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ItemsDao;
import ssm.entity.Items;

import java.util.List;

/**
 * Created by guozhaohui628@gmail.com on 2018/5/8
 * Description:
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    // 注入Service依赖
    @Autowired
    private ItemsDao itemsdao;

    @Override
    public List<Items> queryAllItemsList() {
        return itemsdao.queryAllItemsList();
    }
}
