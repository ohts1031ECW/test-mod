package testmod.ohts1031ECW.testmod1.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import testmod.ohts1031ECW.testmod1.Testmod1;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Testmod1.MOD_ID);

    //add item
    public static final RegistryObject<Item> TESTITEM  = ITEMS.register(
            "testitem",
            () -> new Item(new Item.Properties())
            );

    public static final RegistryObject<Item> TESTITEMv2  = ITEMS.register(
            "testitemv2",
            () -> new Item(new Item.Properties())
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
