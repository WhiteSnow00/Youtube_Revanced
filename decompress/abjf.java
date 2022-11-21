import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjf
{
    public final aslm a;
    public final aske b;
    public final aske c;
    public final aske d;
    public final aske e;
    public final aske f;
    public final aske g;
    public final aske h;
    public final asla i;
    public final aske j;
    public final aske k;
    public final aske l;
    public final aske m;
    public final atnb n;
    public final aske o;
    public final absq p;
    public final HashMap q;
    public final acbc r;
    public final acax s;
    public absp t;
    public String u;
    public final String v;
    
    public abjf(final acav acav, final atnb n, final abnd abnd, final byte[] array) {
        this.u = acav.aa();
        this.v = acav.aa();
        this.p = acav.j();
        this.s = acav.o();
        this.q = new HashMap();
        this.g = acav.J();
        this.b = acav.X();
        this.c = acav.V();
        this.d = acav.I();
        this.e = acav.u();
        this.f = acav.P();
        this.h = acav.F();
        this.i = acav.Y();
        this.k = acav.C();
        this.o = acav.R();
        this.j = (aske)abnd.h;
        this.l = (aske)abnd.j;
        this.m = abnd.c();
        this.n = n;
        this.r = acav.p();
        this.a = new aslm();
    }
    
    public final void a() {
        this.u = this.v;
        final absp t = this.t;
        if (t != null) {
            t.r();
            this.t = null;
        }
    }
    
    public final boolean b(final String s) {
        return s.equals(this.v);
    }
}
