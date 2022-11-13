import android.media.MediaDrm;
import android.media.MediaDrm$OnExpirationUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blc implements MediaDrm$OnExpirationUpdateListener
{
    public final xra a;
    
    public blc(final xra a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void onExpirationUpdate(final MediaDrm mediaDrm, final byte[] array, final long n) {
        final xra a = this.a;
        if (array == null) {
            return;
        }
        zdf.a((Object)((ysg)a.a).e);
        ((ysg)a.a).e.post((Runnable)new hcn(a, array, n, 20, null, null));
    }
}
