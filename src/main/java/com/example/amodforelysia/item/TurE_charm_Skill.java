package com.example.amodforelysia.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

public class TurE_charm_Skill extends TurE_charm {

    // 必须使用唯一的UUID（这里随机生成一个新的）
    private static final UUID SLOT_UUID = UUID.fromString("a3d8f1b2-47e9-4f6c-9d0a-1ecb7c9d5e1f");

    public TurE_charm_Skill() {
        super(new Properties()
                .stacksTo(1) // 只能持有一个
                .rarity(Rarity.EPIC)); // 稀有度设置
    }

    public TurE_charm_Skill(Properties properties) {
        super(properties);
    }
    @Override
    protected void equipmentTick(LivingEntity livingEntity) {
        //System.out.println("装备正确运行"); // 在return前输出
        livingEntity.addEffect(new MobEffectInstance(
                MobEffects.DAMAGE_RESISTANCE,
                200,
                4,
                false,
                false,
                true));
        //System.out.println("夜视正常"); // 在return前输出
    }


    //摘下护符移除抗性提升效果
    @Override
    protected void onPlayerUnequip(LivingEntity livingEntity)
    {
        if (livingEntity.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
            livingEntity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
        }
    }

    //穿戴时饰品栏位加1
    @SuppressWarnings({"UnstableApiUsage", "removal"})
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> attributes = HashMultimap.create();
        LivingEntity var6 = slotContext.entity();
        if (var6 instanceof Player player) {
            CuriosApi.getCuriosHelper().addSlotModifier(attributes, "charm", UUID.fromString("be132e6a-031d-4e61-b15e-652d7051131f"), (double)1.0F, AttributeModifier.Operation.ADDITION);
        }

        return attributes;
    }



}
