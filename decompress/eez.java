import android.text.TextUtils$TruncateAt;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eez extends dsr
{
    public efb a;
    dsx d;
    
    public static /* bridge */ void d(final eez eez, final dsx d, final efb a) {
        eez.v(d, (dst)a);
        eez.a = a;
        eez.d = d;
    }
    
    @Override
    public final /* bridge */ dst a() {
        return (dst)this.c();
    }
    
    @Override
    protected final void b(final dst dst) {
        this.a = (efb)dst;
    }
    
    public final efb c() {
        final efb a = this.a;
        final int u = efb.U;
        final String p = ((dst)a).p();
        bhv o;
        if ((o = this.a.O) == null) {
            o = this.d.o(p, 1008096338);
        }
        final efb a2 = this.a;
        a2.O = o;
        bhv p2;
        if ((p2 = a2.P) == null) {
            p2 = this.d.o(p, -50354224);
        }
        final efb a3 = this.a;
        a3.P = p2;
        bhv q;
        if ((q = a3.Q) == null) {
            q = this.d.o(p, -430503342);
        }
        final efb a4 = this.a;
        a4.Q = q;
        bhv r;
        if ((r = a4.R) == null) {
            r = this.d.o(p, 2092727750);
        }
        final efb a5 = this.a;
        a5.R = r;
        bhv s;
        if ((s = a5.S) == null) {
            s = this.d.o(p, 663828400);
        }
        final efb a6 = this.a;
        a6.S = s;
        bhv t;
        if ((t = a6.T) == null) {
            t = this.d.o(p, -537896591);
        }
        final efb a7 = this.a;
        a7.T = t;
        return a7;
    }
    
    public final void e(final dun n) {
        this.a.N = n;
    }
    
    public final void f(final TextUtils$TruncateAt b) {
        this.a.b = b;
    }
    
    public final void g(final int d) {
        this.a.d = d;
    }
}
