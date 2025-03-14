package com.example.amodforelysia.client;

import com.example.amodforelysia.item.TurE_charm_Skill;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "amodforelysia", value = Dist.CLIENT)
public class ModTooltips {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();

        // 检查是否是你要添加描述的物品
        if (stack.getItem() == TurE_charm_Skill.TURE_CHARM.get()) {

            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm00"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm01"));

            // 添加描述文本（支持本地化键）
            if(Screen.hasShiftDown()) {
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm1").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm2").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm3").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm4").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm5").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm6").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm7").withStyle(Style.EMPTY.withColor(0xFF69B4).withItalic(false)));
            }
            else{
                event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm02"));
            }





            //event.getToolTip().add(Component.translatable("tooltip.yourmod.your_item.desc"));


        }
    }
}
