import android.text.Spanned;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glk
{
    public final long a;
    public final boolean b;
    public CharSequence c;
    public amgs d;
    public aotp e;
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
    public aiqj s;
    public aiqj t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    private int z;
    
    public glk(final CharSequence c, final int y, final boolean b, final String g, final amgs d, final long a, final apil apil) {
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
        if (apil != null) {
            this.d(apil);
        }
    }
    
    public final void a(final boolean v, final boolean w) {
        this.v = v;
        this.w = w;
    }
    
    public final void b() {
        this.x = true;
    }
    
    public final void c(final adms adms) {
        if (adet.x(adms, aphv.E)) {
            this.u = true;
        }
        this.z = 0;
        int i;
        if ((i = adkp.i(adms.c)) == 0) {
            i = 1;
        }
        if (--i != 0) {
            if (i == 1) {
                this.j = 1.0;
                this.k = 0.0;
                return;
            }
            if (i == 3) {
                aphv aphv;
                if ((aphv = aphv.b(adms.d)) == null) {
                    aphv = aphv.a;
                }
                if (aphv != aphv.v) {
                    this.l = true;
                }
            }
        }
        else {
            final int d = adms.d;
            aphv aphv2;
            if ((aphv2 = aphv.b(d)) == null) {
                aphv2 = aphv.a;
            }
            if (aphv2 == aphv.h) {
                this.z = 1;
                return;
            }
            aphv aphv3;
            if ((aphv3 = aphv.b(d)) == null) {
                aphv3 = aphv.a;
            }
            if (aphv3 == aphv.i) {
                this.z = 2;
            }
        }
    }
    
    public final void d(final apil apil) {
        final int b = apil.b;
        final aiqj aiqj = null;
        ajut ajut;
        if ((b & 0x4) != 0x0) {
            if ((ajut = apil.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        this.q = acak.b(ajut);
        ajut ajut2;
        if ((apil.b & 0x8) != 0x0) {
            if ((ajut2 = apil.e) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        this.r = acak.b(ajut2);
        aiqj s = aiqj;
        if ((apil.b & 0x10) != 0x0 && (s = apil.f) == null) {
            s = aiqj.a;
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
