// 
// Decompiled by Procyon v0.6.0
// 

public class atow extends atrk implements atrb, atld, atpz, atqf
{
    public final atli a;
    
    public atow(final atli atli) {
        this.C((atrb)atli.get(atrb.c));
        this.a = atli.plus((atli)this);
    }
    
    protected final String a() {
        return String.valueOf(atqc.a((Object)this)).concat(" was cancelled");
    }
    
    public final atli c() {
        return this.a;
    }
    
    protected void d(final Object o) {
        this.tL(o);
    }
    
    public final void e(final Throwable t) {
        aume.k(this.a, t);
    }
    
    protected void f(final Throwable t, final boolean b) {
    }
    
    protected void g(final Object o) {
    }
    
    public final atli getContext() {
        return this.a;
    }
    
    protected final void h(final Object o) {
        if (o instanceof atpm) {
            final atpm atpm = (atpm)o;
            this.f(atpm.b, atpm.c.a());
            return;
        }
        this.g(o);
    }
    
    public final void i(int n, final Object o, final atmp atmp) {
        if (--n == 0) {
            atvp.a(atmp, o, (atld)this);
            return;
        }
        if (n != 2) {
            return;
        }
        atza.e(atza.d(atmp, o, (atld)this)).resumeWith(atjv.a);
    }
    
    public final Object j(final atld atld) {
        while (true) {
            Object w;
            do {
                w = this.w();
                if (!(w instanceof atqw)) {
                    if (!(w instanceof atpm)) {
                        final Object o = atrl.b(w);
                        final atlk a = atlk.a;
                        return o;
                    }
                    final Throwable b = ((atpm)w).b;
                    if (!atqb.b) {
                        throw b;
                    }
                    throw atvi.a(b, (atlq)atld);
                }
            } while (super.u(w) < 0);
            final atrg atrg = new atrg(atza.e(atld), (atrk)this);
            ((atpe)atrg).t();
            ((atpd)atrg).b((atml)new atqn(this.tJ((atml)new atrr((atpe)atrg))));
            final Object o = ((atpe)atrg).h();
            final atlk a2 = atlk.a;
            continue;
        }
    }
    
    public final void resumeWith(Object x) {
        x = this.x(aulo.l(x));
        if (x == atrl.b) {
            return;
        }
        this.d(x);
    }
    
    public final String tI() {
        final atli a = this.a;
        a.getClass();
        final boolean a2 = atqb.a;
        String string = null;
        if (a2) {
            final atpx atpx = (atpx)a.get(atpx.b);
            if (atpx != null) {
                if (a.get(atpy.a) != null) {
                    throw null;
                }
                final long a3 = atpx.a;
                final StringBuilder sb = new StringBuilder("coroutine#");
                sb.append(a3);
                string = sb.toString();
            }
        }
        if (string == null) {
            return atqc.a((Object)this);
        }
        final String a4 = atqc.a((Object)this);
        final StringBuilder sb2 = new StringBuilder("\"");
        sb2.append(string);
        sb2.append("\":");
        sb2.append(a4);
        return sb2.toString();
    }
}
