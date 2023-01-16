package com.example.designpatterns.bridge;

import com.example.designpatterns.bridge.step2.KDA;
import com.example.designpatterns.bridge.step2.PoolParty;
import com.example.designpatterns.bridge.step2.아리;
import com.example.designpatterns.bridge.step2.아칼리;

public class App {
    public static void main(String[] args) {
        Champion ari = new 아리(new KDA());
        ari.skillE();
        ari.skillR();

        Champion 아칼리 = new 아칼리(new PoolParty());
        아칼리.skillE();
        아칼리.skillR();

    }
}
