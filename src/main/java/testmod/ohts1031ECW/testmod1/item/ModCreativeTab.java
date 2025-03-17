package testmod.ohts1031ECW.testmod1.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import testmod.ohts1031ECW.testmod1.Testmod1;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Testmod1.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_MOD_TAB = CREATIVE_MODE_TABS.register(
            "test_mod_tab",
            () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModItems.TESTITEM.get()))
                        .title(Component.translatable("creativetab.test_tab1"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.TESTITEM.get());
                            output.accept(ModItems.TESTITEMv2.get());
                        })
                        .build()


            );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
