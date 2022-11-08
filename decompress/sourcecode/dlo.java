import android.os.SystemClock;
import android.os.Handler$Callback;
import android.os.Looper;
import java.util.ArrayList;
import android.os.Handler;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlo
{
    public final dct a;
    public final List b;
    public final dcl c;
    public boolean d;
    public dlm e;
    public boolean f;
    public dlm g;
    public Bitmap h;
    public dlm i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final dgf n;
    private boolean o;
    private dci p;
    
    public dlo(final dbo dbo, final dct a, final int n, final int n2, final dds dds, final Bitmap bitmap) {
        final dgf a2 = dbo.a;
        final dcl c = dbo.c(dbo.a());
        final dci b = dbo.c(dbo.a()).b().b(((dng)((dng)((dng)dnp.b(dfh.a)).T()).V()).G(n, n2));
        this.b = new ArrayList();
        this.c = c;
        final Handler m = new Handler(Looper.getMainLooper(), (Handler$Callback)new bnd(this, 2));
        this.n = a2;
        this.m = m;
        this.p = b;
        this.a = a;
        this.e(dds, bitmap);
    }
    
    final int a() {
        return ((dcw)this.a).f.c;
    }
    
    public final void b() {
        if (this.d) {
            if (!this.o) {
                final dlm i = this.i;
                if (i != null) {
                    this.i = null;
                    this.c(i);
                    return;
                }
                this.o = true;
                final dcw dcw = (dcw)this.a;
                final dcv f = dcw.f;
                final int c = f.c;
                int j = 0;
                if (c > 0) {
                    final int e = dcw.e;
                    if (e < 0) {
                        j = j;
                    }
                    else if (e < c) {
                        j = ((dcu)f.e.get(e)).i;
                    }
                    else {
                        j = -1;
                    }
                }
                final long uptimeMillis = SystemClock.uptimeMillis();
                this.a.b();
                this.g = new dlm(this.m, ((dcw)this.a).e, uptimeMillis + j);
                this.p.b((dng)dnp.c((ddj)new dor((Object)Math.random()))).h((Object)this.a).r((doc)this.g);
            }
        }
    }
    
    public final void c(final dlm dlm) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, (Object)dlm).sendToTarget();
            return;
        }
        if (this.d) {
            if (dlm.b != null) {
                this.d();
                final dlm e = this.e;
                this.e = dlm;
                int size = this.b.size();
                while (--size >= 0) {
                    ((dln)this.b.get(size)).c();
                }
                if (e != null) {
                    this.m.obtainMessage(2, (Object)e).sendToTarget();
                }
            }
            this.b();
            return;
        }
        this.i = dlm;
    }
    
    public final void d() {
        final Bitmap h = this.h;
        if (h != null) {
            this.n.d(h);
            this.h = null;
        }
    }
    
    final void e(final dds dds, final Bitmap h) {
        cll.h((Object)dds);
        cll.h((Object)h);
        this.h = h;
        this.p = this.p.b(((dng)new dnp()).M(dds));
        this.j = dpg.a(h);
        this.k = h.getWidth();
        this.l = h.getHeight();
    }
    
    public final void f() {
        this.d = false;
    }
}
