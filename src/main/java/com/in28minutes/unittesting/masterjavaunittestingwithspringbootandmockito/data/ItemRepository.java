package com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.unittesting.masterjavaunittestingwithspringbootandmockito.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	
}
