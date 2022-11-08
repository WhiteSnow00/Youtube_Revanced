import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aacb extends vjn
{
    public final List a;
    public long b;
    
    public aacb(final adcr adcr, final zkh zkh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline/offline_video_playback_position_sync", adcr, zkh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
    }
    
    protected final void c() {
        agot.u(this.b >= 0L);
        agot.u(this.a.isEmpty() ^ true);
    }
}
