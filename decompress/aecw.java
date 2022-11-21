import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecw implements aecv
{
    private final aedd a;
    private final aecu b;
    private final Context c;
    
    public aecw(final aedd a, final aecu b, final Context c) {
        new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final nnt a() {
        final aedd a = this.a;
        final String packageName = this.c.getPackageName();
        Object o;
        if (a.a == null) {
            o = aedd.c();
        }
        else {
            final noj noj = new noj();
            a.a.f(new aecz(a, noj, packageName, noj, null), noj);
            o = noj.a;
        }
        return (nnt)o;
    }
    
    public final void b(final aedm aedm) {
        synchronized (this) {
            this.b.b(aedm);
        }
    }
    
    public final void c(final aedm aedm) {
        synchronized (this) {
            this.b.c(aedm);
        }
    }
    
    public final void d() {
        final aedd a = this.a;
        final String packageName = this.c.getPackageName();
        if (a.a == null) {
            aedd.c();
            return;
        }
        final noj noj = new noj();
        a.a.f(new aeda(a, noj, noj, packageName, null), noj);
    }
    
    public final void e(final aect aect, final int n, final Activity activity) {
        final aecy a = aecy.a(n);
        if (activity != null) {
            if (aect != null && aect.a(a) != null && !aect.c) {
                aect.c = true;
                activity.startIntentSenderForResult(aect.a(a).getIntentSender(), 2400, (Intent)null, 0, 0, 0, (Bundle)null);
            }
        }
    }
}
