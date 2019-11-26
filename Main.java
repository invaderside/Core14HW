package com.company;
import entity.Flower;
import entity.FlowerShop;
import entity.Rose;

import java.util.List;
import java.util.Scanner;


public class Main {
public static void main(String[]args)
{
    FlowerShop flowerShop = new FlowerShop();
    List<Flower> flowers=flowerShop.sell();

    }
}
