import android.media.MediaDrm;
import android.media.MediaDrm$OnEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blh implements MediaDrm$OnEventListener
{
    public final blc a;
    
    public blh(final blc a) {
        this.a = a;
    }
    
    public final void onEvent(final MediaDrm mediaDrm, final byte[] array, final int n, final int n2, final byte[] array2) {
        this.a.a(array, n);
    }
}
