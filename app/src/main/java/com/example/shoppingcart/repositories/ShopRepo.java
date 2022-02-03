package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "iMac 21", 1299, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/imac21.jpg?alt=media&token=42a37525-a24f-431a-9382-208efd992797" ));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Air", 799, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/ipad%20air.jpeg?alt=media&token=9156bb0f-ecbc-47be-925e-fc7c4ee419d3"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Pro", 999, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/ipadpro.jpg?alt=media&token=3818c9e1-4738-43be-af37-4fb6b40732ae"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11", 699, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/iphone11.jpg?alt=media&token=25ca5ed3-f826-4d00-b8dc-ec76cea6b4e4"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro", 999, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/iphone11pro.jpg?alt=media&token=c3e2162a-e915-4edb-99ae-ac786f3a9a05"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro Max", 1099, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/iphone11promax.jpg?alt=media&token=46e03813-820e-4bab-a208-bddb3e2d0c33"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 13", 899, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/iphone13.jpg?alt=media&token=280565d9-7de0-44e8-afc0-7aa70752ebe3"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro", 1299, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/macbookpro.jpeg?alt=media&token=b6805d0b-d210-4b24-862a-b3fea47ca289"));
        productList.add(new Product(UUID.randomUUID().toString(), "Apple Watch Series 7", 399, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/applewatchseries7.webp?alt=media&token=890cde74-4aa5-4ae2-8639-37131c1ce04f"));
        productList.add(new Product(UUID.randomUUID().toString(), "Custom Air pods", 2399, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/airpods.jpg?alt=media&token=913ca01a-1919-4e7a-8ba0-7bf9187175ce"));
        productList.add(new Product(UUID.randomUUID().toString(), "Waffle Chips", 200, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/wafflechips.jpg?alt=media&token=7b657d49-9e99-4590-8c06-e982055866cb" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Sundae", 199, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/sundae.jpg?alt=media&token=1baba972-e360-43ed-9bc1-8da65b06645a" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Brownie-12 pcs", 99, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/brownie.jpg?alt=media&token=5ad99c4b-3baa-4898-9042-b258fd226a24" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Gelato Cake", 299, true, "https://firebasestorage.googleapis.com/v0/b/shopping-app-8046f.appspot.com/o/gelatocake.jpg?alt=media&token=1818e7e6-5255-45dd-b00a-4ebd01174d8f" ));
        mutableProductList.setValue(productList);
    }
}
