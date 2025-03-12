package com.example.amodforelysia.client;

import com.example.amodforelysia.item.TurE_charm_Skill;
import net.minecraft.network.chat.Component;
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
            // 添加描述文本（支持本地化键）
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm1"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm2"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm3"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm4"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm5"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm6"));
            event.getToolTip().add(Component.translatable("tooltip.amodforelysia.ture_charm7"));
        }
    }
}
