import android.os.SystemClock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class erx extends aepk
{
    final oby a;
    public long b;
    public boolean c;
    atke d;
    atke e;
    atke f;
    atke g;
    atke h;
    atke i;
    atke j;
    atke k;
    atke l;
    atke m;
    atke n;
    atke o;
    atke p;
    atke q;
    private ert t;
    
    public erx() {
        this.a = (oby)new tvc(0);
    }
    
    protected final void attachBaseContext(final Context context) {
        this.b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
    }
    
    protected abstract void e();
    
    final void f(final atke atke) {
        this.t = (ert)atke.a();
    }
    
    public final void onTrimMemory(final int n) {
        final atke i = this.i;
        final boolean b = false;
        boolean b2;
        if (i != null && (((tnu)i.a()).e(tnu.D) & 0x10L) == 0x0L) {
            if (this.t == null) {
                final atke f = this.f;
                if (f != null) {
                    this.f(f);
                }
            }
            b2 = true;
        }
        else {
            b2 = false;
        }
        final ert t = this.t;
        boolean b3 = b2;
        if (t != null) {
            boolean b4 = false;
            Label_0165: {
                if (t.b != 1) {
                    b4 = b;
                    if (t.b != 2) {
                        break Label_0165;
                    }
                    b4 = b;
                    if (n < 20) {
                        break Label_0165;
                    }
                }
                if ((t.c & 0x1L) == 0x0L) {
                    t.b(n);
                    t.a(n);
                }
                else {
                    t.a.execute((Runnable)new ccm(t, n, 5));
                }
                b4 = true;
            }
            b3 = (b2 | b4);
        }
        if (b3) {
            super.onTrimMemory(n);
        }
    }
}
