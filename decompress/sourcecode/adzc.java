import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adzc implements adzb
{
    private final adzj a;
    private final adza b;
    private final Context c;
    
    public adzc(final adzj a, final adza b, final Context c) {
        new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final nly a() {
        final adzj a = this.a;
        final String packageName = this.c.getPackageName();
        Object o;
        if (a.a == null) {
            o = adzj.c();
        }
        else {
            final nmo nmo = new nmo();
            a.a.f((aeau)new adzf(a, nmo, packageName, nmo, null), nmo);
            o = nmo.a;
        }
        return (nly)o;
    }
    
    public final void b(final adzs adzs) {
        synchronized (this) {
            this.b.b((adzw)adzs);
        }
    }
    
    public final void c(final adzs adzs) {
        synchronized (this) {
            this.b.c((adzw)adzs);
        }
    }
    
    public final void d() {
        final adzj a = this.a;
        final String packageName = this.c.getPackageName();
        if (a.a == null) {
            adzj.c();
            return;
        }
        final nmo nmo = new nmo();
        a.a.f((aeau)new adzg(a, nmo, nmo, packageName, null), nmo);
    }
    
    public final void e(final adyz adyz, final int n, final Activity activity) {
        final adze a = adze.a(n);
        if (activity != null) {
            if (adyz != null && adyz.a(a) != null && !adyz.c) {
                adyz.c = true;
                activity.startIntentSenderForResult(adyz.a(a).getIntentSender(), 2400, (Intent)null, 0, 0, 0, (Bundle)null);
            }
        }
    }
}
