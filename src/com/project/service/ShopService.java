package com.project.service;

import java.util.List;

import com.project.exceptions.ConnectionFailedException;
import com.project.model.Shop;

public interface ShopService {

	String addShopDetails(List<Shop> shop);

	List<Shop> displayShopDetails() throws ConnectionFailedException;

	Shop searchShopByName(String shopName) throws ConnectionFailedException;

	String deleteShop(String shopId) throws ConnectionFailedException;

	void displayShops() throws ConnectionFailedException;

}
