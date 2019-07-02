package com.bgsoftware.wildstacker.key;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class Key {

    private String key;

    private Key(String key){
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }

    public static Key of(EntityType entityType){
        return of(entityType.name());
    }

    public static Key of(ItemStack itemStack){
        return of(itemStack.getType(), itemStack.getDurability());
    }

    public static Key of(Material material, short data){
        return of(material + ":" + data);
    }

    public static Key of(String key){
        return new Key(key.replace("LEGACY_", ""));
    }

}
