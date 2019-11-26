package entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {

    int wallet;
    private Object Rose;

    public List<Flower> sell()
    {
        System.out.println("Введите кол-во роз:");
        Scanner scannerRose = new Scanner(System.in);
        int r = Integer.parseInt(scannerRose.next());
        System.out.println("Введите кол-во ромашек:");
        Scanner scannerChamomile = new Scanner(System.in);
        int c = Integer.parseInt(scannerChamomile.next());
        System.out.println("Введите кол-во тюльпанов:");
        Scanner scannerTulip = new Scanner(System.in);
        int t = Integer.parseInt(scannerTulip.next());
        List<Flower> flowers= new ArrayList<>();
        for(int a = 1; a <= r; a++)
        {
            flowers.add(new Rose());
        }
        for(int a = 1; a <= c; a++)
        {
            flowers.add(new Chamomile());
        }
        for (int a = 1; a <= t; a++){
            flowers.add(new Tulip());
            }

        System.out.println("Сейчас в букете: ");
        System.out.println(Arrays.toString(new List[]{flowers}));
        return flowers;
    }
}
