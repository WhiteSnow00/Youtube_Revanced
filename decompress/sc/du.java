import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;

// 
// Decompiled by Procyon v0.6.0
// 

public class du implements IBinder$DeathRecipient
{
    public final MediaController$Callback a;
    dt b;
    public do c;
    
    public du() {
        this.a = new ds(this);
    }
    
    public void a(final MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }
    
    public void b(final PlaybackStateCompat playbackStateCompat) {
    }
    
    public final void binderDied() {
        this.d(8, null, null);
    }
    
    public void c() {
        throw null;
    }
    
    public final void d(final int n, final Object o, final Bundle data) {
        final dt b = this.b;
        if (b != null) {
            final Message obtainMessage = b.obtainMessage(n, o);
            obtainMessage.setData(data);
            obtainMessage.sendToTarget();
        }
    }
    
    public final void e(final Handler handler) {
        if (handler == null) {
            final dt b = this.b;
            if (b != null) {
                b.a = false;
                b.removeCallbacksAndMessages((Object)null);
                this.b = null;
            }
            return;
        }
        final dt b2 = new dt(this, handler.getLooper());
        this.b = b2;
        b2.a = true;
    }
}
