import android.os.SystemClock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eru extends aenk
{
    final oas a;
    public long b;
    public boolean c;
    atjj d;
    atjj e;
    atjj f;
    atjj g;
    atjj h;
    atjj i;
    atjj j;
    atjj k;
    atjj l;
    atjj m;
    atjj n;
    atjj o;
    atjj p;
    atjj q;
    private erq t;
    
    public eru() {
        this.a = (oas)new tsy(0);
    }
    
    protected final void attachBaseContext(final Context context) {
        this.b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
    }
    
    protected abstract void e();
    
    final void f(final atjj atjj) {
        this.t = (erq)atjj.a();
    }
    
    public final void onTrimMemory(final int n) {
        final atjj i = this.i;
        final boolean b = false;
        boolean b2;
        if (i != null && (((tlq)i.a()).e(tlq.D) & 0x10L) == 0x0L) {
            if (this.t == null) {
                final atjj f = this.f;
                if (f != null) {
                    this.f(f);
                }
            }
            b2 = true;
        }
        else {
            b2 = false;
        }
        final erq t = this.t;
        boolean b3 = b2;
        if (t != null) {
            boolean b4 = false;
            Label_0154: {
                if (t.b != 1) {
                    b4 = b;
                    if (t.b != 2) {
                        break Label_0154;
                    }
                    b4 = b;
                    if (n < 20) {
                        break Label_0154;
                    }
                }
                if ((t.c & 0x1L) == 0x0L) {
                    t.b(n);
                    t.a(n);
                }
                else {
                    t.a.execute(new ccl(t, n, 5));
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
