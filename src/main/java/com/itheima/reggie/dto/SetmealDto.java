package com.itheima.reggie.dto;

import com.itheima.reggie.entity.DishFlavor;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> flavors = new ArrayList<>();

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
