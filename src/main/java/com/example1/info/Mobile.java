
package com.example1.info;

import java.util.Objects;

public class Mobile {

    int id;
    String name;
    String price;

    public Mobile(int id, String name, String price) {
        this.id=id;
        this.name=name;
        this.price=price;

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String city) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile =  (Mobile) o;
       return id == mobile.id && (name.equals(mobile.name)) && (price.equals(mobile.price));
        //return (mobile.name == this.name && mobile.id ==this.id && mobile.price == this.price);

           }
    @Override
    public int hashCode() {
      return Objects.hash(id, name, price);// we can take only one i.e. id
    }


    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price +
                '}';
    }

}
