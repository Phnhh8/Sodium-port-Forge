package net.caffeinemc.mods.sodium.forge;

import net.caffeinemc.mods.sodium.api.config.ConfigEntryPointForge;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod("sodium")
public class SodiumForgeMod {
    public SodiumForgeMod() {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            // Khởi tạo lõi Sodium từ module common
            SodiumClientMod.onInitialization(ModList.get().getModContainerById("sodium")
                    .map(c -> c.getModInfo().getVersion().toString())
                    .orElse("0.6.0"));
            
            // Kích hoạt entrypoint config của Forge (đã có sẵn interface trong common/api)
            ModList.get().getAllScanData().forEach(scanData -> {
                // Đăng ký các mod tích hợp ConfigEntryPointForge tại đây
            });
        }
    }
}
