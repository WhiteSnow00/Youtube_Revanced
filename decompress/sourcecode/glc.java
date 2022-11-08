import android.text.Spanned;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glc
{
    public final long a;
    public final boolean b;
    public CharSequence c;
    public ameo d;
    public aorm e;
    public Bitmap f;
    public String g;
    public double h;
    public double i;
    public double j;
    public double k;
    public boolean l;
    public boolean m;
    public double n;
    public Spanned o;
    public Spanned p;
    public Spanned q;
    public Spanned r;
    public aioe s;
    public aioe t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    private int z;
    
    public glc(final CharSequence c, final int y, final boolean b, final String g, final ameo d, final long a, final apgh apgh) {
        this.y = 1;
        d.getClass();
        this.c = c;
        this.y = y;
        this.b = b;
        this.g = g;
        this.d = d;
        this.k = Double.POSITIVE_INFINITY;
        this.a = a;
        this.n = -1.0;
        this.h = -1.0;
        this.i = -1.0;
        this.j = -1.0;
        if (apgh != null) {
            this.d(apgh);
        }
    }
    
    public final void a(final boolean v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    public final void b() {
        this.x = true;
    }
    
    public final void c(final adkr adkr) {
        if (adcr.y(adkr, apfr.E)) {
            this.u = true;
        }
        this.z = 0;
        int c;
        if ((c = adio.C(adkr.c)) == 0) {
            c = 1;
        }
        if (--c != 0) {
            if (c == 1) {
                this.j = 1.0;
                this.k = 0.0;
                return;
            }
            if (c == 3) {
                apfr apfr;
                if ((apfr = apfr.b(adkr.d)) == null) {
                    apfr = apfr.a;
                }
                if (apfr != apfr.v) {
                    this.l = true;
                }
            }
        }
        else {
            final int d = adkr.d;
            apfr apfr2;
            if ((apfr2 = apfr.b(d)) == null) {
                apfr2 = apfr.a;
            }
            if (apfr2 == apfr.h) {
                this.z = 1;
                return;
            }
            apfr apfr3;
            if ((apfr3 = apfr.b(d)) == null) {
                apfr3 = apfr.a;
            }
            if (apfr3 == apfr.i) {
                this.z = 2;
            }
        }
    }
    
    public final void d(final apgh apgh) {
        final int b = apgh.b;
        final aioe aioe = null;
        ajsq ajsq;
        if ((b & 0x4) != 0x0) {
            if ((ajsq = apgh.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        this.q = abyh.b(ajsq);
        ajsq ajsq2;
        if ((apgh.b & 0x8) != 0x0) {
            if ((ajsq2 = apgh.e) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        this.r = abyh.b(ajsq2);
        aioe s = aioe;
        if ((apgh.b & 0x10) != 0x0 && (s = apgh.f) == null) {
            s = aioe.a;
        }
        this.s = s;
    }
    
    public final boolean e() {
        return this.z == 2;
    }
    
    public final boolean f() {
        return this.z == 1;
    }
    
    public final void g(final int n) {
        if (n == 4) {
            this.m = true;
        }
    }
}
