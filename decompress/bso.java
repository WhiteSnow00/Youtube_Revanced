import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.content.Context;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bso
{
    public final bsc a;
    public final bsk b;
    public final bsn c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    private float p;
    private float q;
    
    public bso(final Context context) {
        this.a = new bsc();
        final bsn bsn = null;
        bsk b = null;
        Label_0100: {
            if (context != null) {
                final Context applicationContext = context.getApplicationContext();
                final int a = baz.a;
                final int a2 = bsm.a;
                final DisplayManager displayManager = (DisplayManager)applicationContext.getSystemService("display");
                bsm bsm;
                if (displayManager != null) {
                    bsm = new bsm(displayManager);
                }
                else {
                    bsm = null;
                }
                b = bsm;
                if (bsm != null) {
                    break Label_0100;
                }
                final WindowManager windowManager = (WindowManager)applicationContext.getSystemService("window");
                if (windowManager != null) {
                    b = new bsl(windowManager);
                    break Label_0100;
                }
            }
            b = null;
        }
        this.b = b;
        bsn a3 = bsn;
        if (b != null) {
            a3 = bsn.a;
        }
        this.c = a3;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.f = -1.0f;
        this.g = 1.0f;
        this.h = 0;
    }
    
    public final void a() {
        if (baz.a >= 30) {
            final Surface e = this.e;
            if (e != null && this.h != Integer.MIN_VALUE) {
                if (this.q != 0.0f) {
                    bsj.a(e, this.q = 0.0f);
                }
            }
        }
    }
    
    public final void b() {
        this.k = 0L;
        this.n = -1L;
        this.l = -1L;
    }
    
    public final void c() {
        if (baz.a >= 30) {
            if (this.e != null) {
                float f;
                if (this.a.a()) {
                    final bsc a = this.a;
                    if (a.a()) {
                        final double n = (double)a.a.b();
                        Double.isNaN(n);
                        f = (float)(1.0E9 / n);
                    }
                    else {
                        f = -1.0f;
                    }
                }
                else {
                    f = this.f;
                }
                final float p = this.p;
                if (f == p) {
                    return;
                }
                boolean b = true;
                Label_0232: {
                    Label_0223: {
                        if (f != -1.0f && p != -1.0f) {
                            final boolean a2 = this.a.a();
                            float n2 = 1.0f;
                            if (a2) {
                                final bsc a3 = this.a;
                                long b2;
                                if (a3.a()) {
                                    b2 = a3.a.b;
                                }
                                else {
                                    b2 = -9223372036854775807L;
                                }
                                n2 = n2;
                                if (b2 >= 5000000000L) {
                                    n2 = 0.02f;
                                }
                            }
                            if (Math.abs(f - this.p) >= n2) {
                                break Label_0223;
                            }
                        }
                        else {
                            if (f != -1.0f) {
                                break Label_0232;
                            }
                            if (this.a.e >= 30) {
                                break Label_0223;
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        return;
                    }
                }
                this.p = f;
                this.d(false);
            }
        }
    }
    
    public final void d(final boolean b) {
        if (baz.a >= 30) {
            final Surface e = this.e;
            if (e != null) {
                if (this.h != Integer.MIN_VALUE) {
                    final boolean d = this.d;
                    float q;
                    final float n = q = 0.0f;
                    if (d) {
                        final float p = this.p;
                        q = n;
                        if (p != -1.0f) {
                            q = this.g * p;
                        }
                    }
                    if (!b && this.q == q) {
                        return;
                    }
                    bsj.a(e, this.q = q);
                }
            }
        }
    }
}
