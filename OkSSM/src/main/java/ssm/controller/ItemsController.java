package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.entity.Items;
import ssm.service.ItemsServiceImpl;

import java.util.List;


/**
 * Created by guozhaohui628@gmail.com on 2018/5/8
 * Description:
 */
@Controller
public class ItemsController {


    // 注入Service依赖
    @Autowired
    private ItemsServiceImpl itemsService;

    @RequestMapping(value = "items/queryitem.action")
    public ModelAndView itemsList(){
        ModelAndView mav = new ModelAndView();
        List<Items> itemsList = itemsService.queryAllItemsList();
        System.out.println(itemsList.toString());
        mav.addObject("itemList", itemsList);
        mav.setViewName("itemList");
        return mav;
    }
}
