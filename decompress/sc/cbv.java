import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import android.os.Message;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import android.util.SparseArray;
import android.os.Messenger;
import android.media.MediaRouter2$RoutingController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbv extends cce
{
    final String a;
    final MediaRouter2$RoutingController b;
    final Messenger c;
    final Messenger d;
    final SparseArray e;
    final Handler f;
    final AtomicInteger g;
    public int h;
    ccc i;
    private final Runnable o;
    
    public cbv(final MediaRouter2$RoutingController b, final String a) {
        this.e = new SparseArray();
        this.g = new AtomicInteger(1);
        this.o = (Runnable)new aus(this, 17);
        this.h = -1;
        this.b = b;
        this.a = a;
        final Messenger messenger = null;
        Messenger c = null;
        Label_0089: {
            if (b != null) {
                final Bundle controlHints = b.getControlHints();
                if (controlHints != null) {
                    c = (Messenger)controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
                    break Label_0089;
                }
            }
            c = null;
        }
        this.c = c;
        Messenger d;
        if (c == null) {
            d = messenger;
        }
        else {
            d = new Messenger((Handler)new cbu(this));
        }
        this.d = d;
        this.f = new Handler(Looper.getMainLooper());
    }
    
    private final void j() {
        this.f.removeCallbacks(this.o);
        this.f.postDelayed(this.o, 1000L);
    }
    
    public final void a() {
        this.b.release();
    }
    
    public final void b(final int n) {
        final MediaRouter2$RoutingController b = this.b;
        if (b == null) {
            return;
        }
        b.setVolume(n);
        this.h = n;
        this.j();
    }
    
    public final void c(int max) {
        final MediaRouter2$RoutingController b = this.b;
        if (b == null) {
            return;
        }
        int n;
        if ((n = this.h) < 0) {
            n = b.getVolume();
        }
        max = Math.max(0, Math.min(n + max, this.b.getVolumeMax()));
        this.h = max;
        this.b.setVolume(max);
        this.j();
    }
    
    final void d(final String s, final int n) {
        final MediaRouter2$RoutingController b = this.b;
        if (b == null || b.isReleased()) {
            goto Label_0116;
        }
        if (this.c == null) {
            goto Label_0116;
        }
        final int andIncrement = this.g.getAndIncrement();
        final Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        final Bundle data = new Bundle();
        data.putInt("volume", n);
        data.putString("routeId", s);
        obtain.setData(data);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        }
        catch (final RemoteException ex) {
            Log.e("MR2Provider", "Could not send control request to service.", (Throwable)ex);
        }
        catch (final DeadObjectException ex2) {
            goto Label_0116;
        }
    }
    
    final void e(final String s, final int n) {
        final MediaRouter2$RoutingController b = this.b;
        if (b == null || b.isReleased()) {
            goto Label_0116;
        }
        if (this.c == null) {
            goto Label_0116;
        }
        final int andIncrement = this.g.getAndIncrement();
        final Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        final Bundle data = new Bundle();
        data.putInt("volume", n);
        data.putString("routeId", s);
        obtain.setData(data);
        obtain.replyTo = this.d;
        try {
            this.c.send(obtain);
        }
        catch (final RemoteException ex) {
            Log.e("MR2Provider", "Could not send control request to service.", (Throwable)ex);
        }
        catch (final DeadObjectException ex2) {
            goto Label_0116;
        }
    }
}
