import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebe implements aebd
{
    private final aebl a;
    private final aebc b;
    private final Context c;
    
    public aebe(final aebl a, final aebc b, final Context c) {
        new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final nnc a() {
        final aebl a = this.a;
        final String packageName = this.c.getPackageName();
        Object o;
        if (a.a == null) {
            o = aebl.c();
        }
        else {
            final nns nns = new nns();
            a.a.f((aecw)new aebh(a, nns, packageName, nns, null), nns);
            o = nns.a;
        }
        return (nnc)o;
    }
    
    public final void b(final aebu aebu) {
        synchronized (this) {
            this.b.b((aeby)aebu);
        }
    }
    
    public final void c(final aebu aebu) {
        synchronized (this) {
            this.b.c((aeby)aebu);
        }
    }
    
    public final void d() {
        final aebl a = this.a;
        final String packageName = this.c.getPackageName();
        if (a.a == null) {
            aebl.c();
            return;
        }
        final nns nns = new nns();
        a.a.f((aecw)new aebi(a, nns, nns, packageName, null), nns);
    }
    
    public final void e(final aebb aebb, final int n, final Activity activity) {
        final aebg a = aebg.a(n);
        if (activity != null) {
            if (aebb != null && aebb.a(a) != null && !aebb.c) {
                aebb.c = true;
                activity.startIntentSenderForResult(aebb.a(a).getIntentSender(), 2400, (Intent)null, 0, 0, 0, (Bundle)null);
            }
        }
    }
}
