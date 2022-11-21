import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafu extends vmz
{
    public final List a;
    public long b;
    
    public aafu(final aefs aefs, final znz znz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline/offline_video_playback_position_sync", aefs, znz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
    }
    
    public final /* bridge */ ahen a() {
        final ahcr builder = ((ahcz)amyb.a).createBuilder();
        final List a = this.a;
        builder.copyOnWrite();
        final amyb amyb = (amyb)builder.instance;
        final ahdp d = amyb.d;
        if (!d.c()) {
            amyb.d = ahcz.mutableCopy(d);
        }
        ahbc.addAll((Iterable)a, (List)amyb.d);
        final long b = this.b;
        builder.copyOnWrite();
        final amyb amyb2 = (amyb)builder.instance;
        amyb2.b |= 0x2;
        amyb2.e = b;
        return (ahen)builder;
    }
    
    protected final void c() {
        adme.K(this.b >= 0L);
        adme.K(this.a.isEmpty() ^ true);
    }
}
