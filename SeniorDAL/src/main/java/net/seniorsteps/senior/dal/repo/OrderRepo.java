/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.dal.repo;

import net.seniorsteps.senior.dal.entity.Order;

/**
 *
 * @author helali
 */
public class OrderRepo extends AbstractEntityRepo<Order>{
    
    public OrderRepo() {
        super(Order.class);
    }
    
}
