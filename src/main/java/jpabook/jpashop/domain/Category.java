package jpabook.jpashop.domain;


import jpabook.jpashop.domain.Item.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private List<Item> items = new ArrayList<>();

    @OneToOne
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();
}
