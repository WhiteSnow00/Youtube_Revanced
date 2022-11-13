import android.os.IInterface;
import java.util.concurrent.Callable;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dab implements ServiceConnection
{
    public final Object a;
    public boolean b;
    public dac c;
    public final czz d;
    
    public dab(final czz d, final dac c) {
        this.d = d;
        this.a = new Object();
        this.b = false;
        this.c = c;
    }
    
    public final void a(final daf daf) {
        synchronized (this.a) {
            final dac c = this.c;
            if (c != null) {
                c.b(daf);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = dam.a;
        final czz d = this.d;
        dau p2;
        if (binder == null) {
            p2 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof dau) {
                p2 = (dau)queryLocalInterface;
            }
            else {
                p2 = new dau(binder);
            }
        }
        d.p = p2;
        final czz d2 = this.d;
        if (d2.f((Callable)new csi(this, 3), 30000L, new cdj(this, 17), d2.b()) == null) {
            this.a(this.d.c());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        dam.f("BillingClient", "Billing service disconnected.");
        this.d.p = null;
        this.d.a = 0;
        synchronized (this.a) {
            final dac c = this.c;
            if (c != null) {
                c.a();
            }
        }
    }
}
