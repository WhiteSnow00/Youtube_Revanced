import android.os.Parcelable;
import android.content.Context;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class gtw implements znj
{
    public final atjd a;
    final /* synthetic */ qbo b;
    private final Uri c;
    private final byte[] d;
    
    public gtw(final qbo b, final Uri c, final byte[] d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = atjd.af();
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error loading video", (Throwable)dbi);
        ((tny)this.b.g).e((Throwable)dbi);
        this.a.tp((Object)gty.a(1, ((tny)this.b.g).b((Throwable)dbi)));
    }
}
