package dmillerw.ping.proxy;

import dmillerw.ping.network.PacketHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        PacketHandler.initialize();
    }

    public void syncConfig() {
    }
}