package controller;

import entity.Fruit;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class FruitsController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        FruitService fruitService = new FruitService();
        List<Fruit> list = fruitService.queryFruitsList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("fruits",list);

        System.out.println(modelAndView.getModelMap());
        modelAndView.setViewName("/WEB-INF/jsp/fruitsList.jsp");
        return modelAndView;
    }
    class FruitService{
        public List<Fruit> queryFruitsList(){
            List<Fruit> list = new ArrayList<Fruit>();
            list.add(new Fruit("苹果",5));
            list.add(new Fruit("火龙果",7));
            list.add(new Fruit("雪莲果",4));
            return list;
        }


    }
}
