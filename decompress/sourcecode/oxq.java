import android.os.Bundle;
import android.app.Activity;
import android.app.Application;
import android.database.ContentObserver;
import android.provider.Settings$System;
import android.view.View;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxq implements Application$ActivityLifecycleCallbacks
{
    public final oyp a;
    public final oyc b;
    public final phq c;
    private final nrw d;
    
    public oxq(final int n, final oyq oyq, final oxl oxl) {
        this.d = new nrw();
        final oyp a = new oyp(b(oyq, n, oxl));
        this.a = a;
        this.b = (oyc)new oys(a);
        this.c = null;
    }
    
    public oxq(final int n, final phq c, final View view, final oyq oyq, final oxl oxl, final byte[] array, final byte[] array2) {
        this.d = new nrw();
        final oyp a = new oyp(b(oyq, n, oxl));
        ((oxr)(this.a = a)).d(view);
        final oyk b = new oyk(c, (byte[])null, (byte[])null);
        if (oxl.b && b.c == null) {
            b.c = new oyj(b.d.m(), b.a);
            final oyj c2 = b.c;
            if (!c2.b) {
                c2.a.registerContentObserver(Settings$System.CONTENT_URI, true, (ContentObserver)c2);
                c2.c = c2.a();
                c2.b = true;
            }
        }
        this.b = (oyc)b;
        this.c = c;
        final Application m = c.m();
        if (m != null && oxl.b) {
            final oyu a2 = oyq.a();
            if (a2 != null) {
                ((oxr)a).a = a2.d;
            }
            m.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
        }
    }
    
    private static final oyd b(final oyq oyq, final int n, final oxl oxl) {
        if (oxl.b && n == 4) {
            return (oyd)new oxt(oyq);
        }
        return (oyd)new oyv(oyq);
    }
    
    public final oxn a(final oyr oyr) {
        final oyr a = oyr.a;
        final int ordinal = oyr.ordinal();
        if (ordinal != 10) {
            if (ordinal != 16) {
                boolean s = false;
                if (ordinal != 17) {
                    switch (ordinal) {
                        default: {
                            this.b.b(this.a, (oxw)oyr);
                            break;
                        }
                        case 6:
                        case 7:
                        case 8: {
                            this.b.b(this.a, (oxw)oyr);
                            this.a.l = true;
                            break;
                        }
                        case 5: {
                            this.b.b(this.a, (oxw)oyr);
                            this.a.l = false;
                            break;
                        }
                        case 4: {
                            this.b.b(this.a, (oxw)oyr);
                            this.a.n(oyr.e);
                            break;
                        }
                        case 1:
                        case 2:
                        case 3: {
                            this.b.b(this.a, (oxw)oyr);
                            this.a.n(oyr);
                            break;
                        }
                        case 0: {
                            final oyp a2 = this.a;
                            a2.l = false;
                            if (this.b.a() > 0.0) {
                                s = true;
                            }
                            a2.s = s;
                            ((oxr)this.a).b = System.currentTimeMillis();
                            this.b.b(this.a, (oxw)oyr);
                            this.a.n(oyr.a);
                            break;
                        }
                    }
                }
                else {
                    this.b.b(this.a, (oxw)oyr);
                    this.a.n = false;
                }
            }
            else {
                this.b.b(this.a, (oxw)oyr);
                this.a.n = true;
            }
        }
        else {
            this.b.b(this.a, (oxw)oyr);
            this.a.p();
        }
        final oxn i = this.a.i(oyr);
        if (!oyr.f()) {
            this.a.m(oyr);
        }
        if (oyr.e() && oyr != oyr.e) {
            this.a.o(oyr.c() + 1);
        }
        return i;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
        final View a = ((oxr)this.a).a();
        if (a != null && nrw.Z(a) == activity) {
            ((oxr)this.a).a = true;
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        final View a = ((oxr)this.a).a();
        if (a != null && nrw.Z(a) == activity) {
            ((oxr)this.a).a = false;
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
