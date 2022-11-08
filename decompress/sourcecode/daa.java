import android.os.IInterface;
import java.util.concurrent.Callable;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class daa implements ServiceConnection
{
    public final Object a;
    public boolean b;
    public dab c;
    public final /* synthetic */ czy d;
    
    public daa(final czy d, final dab c) {
        this.d = d;
        this.a = new Object();
        this.b = false;
        this.c = c;
    }
    
    public final void a(final dae dae) {
        synchronized (this.a) {
            final dab c = this.c;
            if (c != null) {
                c.b(dae);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = dal.a;
        final czy d = this.d;
        dat p2;
        if (binder == null) {
            p2 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof dat) {
                p2 = (dat)queryLocalInterface;
            }
            else {
                p2 = new dat(binder);
            }
        }
        d.p = p2;
        final czy d2 = this.d;
        if (d2.f((Callable)new csh(this, 3), 30000L, (Runnable)new cdi(this, 17), d2.b()) == null) {
            this.a(this.d.c());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        dal.f("BillingClient", "Billing service disconnected.");
        this.d.p = null;
        this.d.a = 0;
        synchronized (this.a) {
            final dab c = this.c;
            if (c != null) {
                c.a();
            }
        }
    }
}
