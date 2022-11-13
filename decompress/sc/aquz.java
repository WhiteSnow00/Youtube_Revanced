import com.google.research.xeno.effect.ProcessorBase$Callback;
import com.google.mediapipe.framework.Packet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquz implements aqvf
{
    public final Packet a;
    public final long b;
    
    public aquz(final Packet a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final long n) {
        final Packet a = this.a;
        final long b = this.b;
        final String a2 = aqvb.a;
        aqvb.nativeSendVideoProcessorAudioPacket(n, a.getNativeHandle(), b, (ProcessorBase$Callback)aqux.a);
    }
}
