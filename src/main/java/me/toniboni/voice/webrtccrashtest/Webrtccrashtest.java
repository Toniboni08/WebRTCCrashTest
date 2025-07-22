package me.toniboni.voice.webrtccrashtest;

import dev.onvoid.webrtc.media.MediaDevices;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;

@EventBusSubscriber
@Mod(Webrtccrashtest.MODID)
public class Webrtccrashtest
{
    public static final String MODID = "webrtccrashtest";


    public Webrtccrashtest(IEventBus modEventBus, ModContainer modContainer)
    {
    }

    @SubscribeEvent
    public static void onJoin(ClientPlayerNetworkEvent.LoggingIn event) {
        MediaDevices.getAudioCaptureDevices();
    }

}
