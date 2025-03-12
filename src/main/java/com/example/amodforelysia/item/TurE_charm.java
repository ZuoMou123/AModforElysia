package com.example.amodforelysia.item;
import com.example.amodforelysia.AModforElysia;

import net.minecraft.world.entity.LivingEntity;

import net.minecraft.world.item.ItemStack;

import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem; // 新增必要接口

import net.minecraft.world.item.Item;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.UUID;


public  abstract class TurE_charm extends Item implements ICurioItem {


    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, AModforElysia.MOD_ID);

    public  static  final RegistryObject<Item> TURE_CHARM=ITEMS.register("ture_charm",
            () -> new TurE_charm_Skill(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public TurE_charm(Properties properties ) {
        super(properties);
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        //System.out.println("tick正常"); // 在return前输出
        this.equipmentTick(slotContext.entity());
    }

    protected abstract void equipmentTick(LivingEntity livingEntity);


    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        this.onPlayerUnequip(slotContext.entity());
    }

    protected abstract void onPlayerUnequip(LivingEntity livingEntity);

















}









