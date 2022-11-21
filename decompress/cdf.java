import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import android.os.Message;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.os.Messenger;
import android.os.IBinder$DeathRecipient;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdf implements IBinder$DeathRecipient
{
    public final Messenger a;
    public final cdh b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final SparseArray g;
    final cdl h;
    private final Messenger i;
    
    public cdf(final cdl h, final Messenger a) {
        this.h = h;
        this.c = 1;
        this.d = 1;
        this.g = new SparseArray();
        this.a = a;
        final cdh b = new cdh(this);
        this.b = b;
        this.i = new Messenger((Handler)b);
    }
    
    public final void a(final int n) {
        this.g(4, this.c++, n, null, null);
    }
    
    public final void b(final int n) {
        this.g(5, this.c++, n, null, null);
    }
    
    public final void binderDied() {
        this.h.n.post((Runnable)new cde(this, 0));
    }
    
    public final void c(final ccg ccg) {
        final int n = this.c++;
        Bundle a;
        if (ccg != null) {
            a = ccg.a;
        }
        else {
            a = null;
        }
        this.g(10, n, 0, a, null);
    }
    
    public final void d(final int n, int n2) {
        final Bundle bundle = new Bundle();
        bundle.putInt("volume", n2);
        n2 = this.c++;
        this.g(7, n2, n, null, bundle);
    }
    
    public final void e(final int n, int n2) {
        final Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", n2);
        n2 = this.c++;
        this.g(6, n2, n, null, bundle);
    }
    
    public final void f(final int n, int n2) {
        final Bundle bundle = new Bundle();
        bundle.putInt("volume", n2);
        n2 = this.c++;
        this.g(8, n2, n, null, bundle);
    }
    
    public final boolean g(final int what, final int arg1, final int arg2, final Object obj, final Bundle data) {
        final Message obtain = Message.obtain();
        obtain.what = what;
        obtain.arg1 = arg1;
        obtain.arg2 = arg2;
        obtain.obj = obj;
        obtain.setData(data);
        obtain.replyTo = this.i;
        try {
            this.a.send(obtain);
            return true;
        }
        catch (final RemoteException ex) {
            if (what == 2) {
                goto Label_0074;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", (Throwable)ex);
        }
        catch (final DeadObjectException ex2) {
            goto Label_0074;
        }
    }
}
