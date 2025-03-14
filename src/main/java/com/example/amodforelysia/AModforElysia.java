package com.example.amodforelysia;

import com.example.amodforelysia.item.TurE_charm;
import com.example.amodforelysia.item.TurE_charm_Skill;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import com.example.amodforelysia.tab.TurE_Tab;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AModforElysia.MOD_ID)
public class AModforElysia
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "amodforelysia";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public AModforElysia()
    {
        @SuppressWarnings("removal") IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TurE_Tab.TAB.register(modEventBus);
        TurE_charm_Skill.ITEMS.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if(event.getTabKey()== CreativeModeTabs.INGREDIENTS){
//            event.accept(TurE_charm.TURE_CHARM);
//        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

    }
}
