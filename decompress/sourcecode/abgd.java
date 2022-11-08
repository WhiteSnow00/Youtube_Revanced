import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgd
{
    public final asib a;
    public final asgt b;
    public final asgt c;
    public final asgt d;
    public final asgt e;
    public final asgt f;
    public final asgt g;
    public final asgt h;
    public final ashp i;
    public final asgt j;
    public final asgt k;
    public final asgt l;
    public final asgt m;
    public final atjj n;
    public final asgt o;
    public final abpe p;
    public final HashMap q;
    public final abxq r;
    public final abxl s;
    public abpd t;
    public String u;
    public final String v;
    
    public abgd(final abxj abxj, final atjj n, final abhr abhr) {
        this.u = abxj.aa();
        this.v = abxj.aa();
        this.p = abxj.j();
        this.s = abxj.o();
        this.q = new HashMap();
        this.g = abxj.J();
        this.b = abxj.X();
        this.c = abxj.V();
        this.d = abxj.I();
        this.e = abxj.u();
        this.f = abxj.P();
        this.h = abxj.F();
        this.i = abxj.Y();
        this.k = abxj.C();
        this.o = abxj.R();
        this.j = (asgt)abhr.e;
        this.l = (asgt)abhr.a;
        this.m = abhr.b();
        this.n = n;
        this.r = abxj.p();
        this.a = new asib();
    }
    
    public final void a() {
        this.u = this.v;
        final abpd t = this.t;
        if (t != null) {
            t.r();
            this.t = null;
        }
    }
    
    public final boolean b(final String s) {
        return s.equals(this.v);
    }
}
