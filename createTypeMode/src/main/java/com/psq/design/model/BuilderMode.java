package com.psq.design.model;

import com.psq.design.service.BuilderModeService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author psq
 * @Date 2021/1/28/17:23
 */
public class BuilderMode {
   private List<BuilderModeService> items = new ArrayList<>();

   public void addItem(BuilderModeService item){
       items.add(item);
   }

   public float getCost(){
       float cost = 0.0f;
       for (BuilderModeService item : items){
           cost += item.price();
       }
       return cost;
   }

    public void showItems(){
        for (BuilderModeService item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
