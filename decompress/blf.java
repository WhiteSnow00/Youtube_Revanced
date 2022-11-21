import android.media.MediaDrm;
import android.media.MediaDrm$OnExpirationUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blf implements MediaDrm$OnExpirationUpdateListener
{
    public final xsj a;
    
    public blf(final xsj a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
    }
    
    public final void onExpirationUpdate(final MediaDrm mediaDrm, final byte[] array, final long n) {
        final xsj a = this.a;
        if (array == null) {
            return;
        }
        zfa.a((Object)((yue)a.a).e);
        ((yue)a.a).e.post((Runnable)new hcw(a, array, n, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
}
