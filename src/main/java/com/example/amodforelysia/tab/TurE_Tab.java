package com.example.amodforelysia.tab;

import com.example.amodforelysia.item.TurE_charm_Skill;
import com.example.amodforelysia.AModforElysia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;


import net.minecraft.world.item.CreativeModeTab;


import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TurE_Tab {

    public static final DeferredRegister<CreativeModeTab> TAB=DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AModforElysia.MOD_ID);



    public static  final RegistryObject<CreativeModeTab> TURE_TAB=TAB.register("ture_tab",
            ()->CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.amodforelysia")) // 标签页标题（需本地化）
                    .icon(() -> new ItemStack(TurE_charm_Skill.TURE_CHARM.get()))  // 使用你的物品作为图标
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(TurE_charm_Skill.TURE_CHARM.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        TAB.register(eventBus);
    }




}
