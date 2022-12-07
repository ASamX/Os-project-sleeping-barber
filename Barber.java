package com.mycompany.sleepingbarbertest;

class Barber implements Runnable {										

    BarberShop shop;
    int barberId;
 
    public Barber(BarberShop shop, int barberId) {
    
        this.shop = shop;
        this.barberId = barberId;
    }

    
    
    @Override
    public void run() {
    
        while(true) {
        
            shop.cutHair(barberId);
        }
    }
}