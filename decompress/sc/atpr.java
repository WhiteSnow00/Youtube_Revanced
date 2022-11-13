// 
// Decompiled by Procyon v0.6.0
// 

public class atpr extends atsf implements atrw, atly, atqu, atra
{
    public final atmd a;
    
    public atpr(final atmd atmd) {
        this.C((atrw)atmd.get((atmb)atrw.c));
        this.a = atmd.plus((atmd)this);
    }
    
    protected final String a() {
        return String.valueOf(atqx.a((Object)this)).concat(" was cancelled");
    }
    
    public final atmd c() {
        return this.a;
    }
    
    protected void d(final Object o) {
        this.tO(o);
    }
    
    public final void e(final Throwable t) {
        aqsx.t(this.a, t);
    }
    
    protected void f(final Throwable t, final boolean b) {
    }
    
    protected void g(final Object o) {
    }
    
    public final atmd getContext() {
        return this.a;
    }
    
    protected final void h(final Object o) {
        if (o instanceof atqh) {
            final atqh atqh = (atqh)o;
            this.f(atqh.b, atqh.c.a());
            return;
        }
        this.g(o);
    }
    
    public final void i(int n, final Object o, final atnk atnk) {
        if (--n == 0) {
            atwm.a(atnk, o, (atly)this);
            return;
        }
        if (n != 2) {
            return;
        }
        auac.d(auac.c(atnk, o, (atly)this)).resumeWith((Object)atkq.a);
    }
    
    public final Object j(final atly atly) {
        while (true) {
            Object w;
            do {
                w = this.w();
                if (!(w instanceof atrr)) {
                    if (!(w instanceof atqh)) {
                        final Object o = atsg.b(w);
                        final atmf a = atmf.a;
                        return o;
                    }
                    final Throwable b = ((atqh)w).b;
                    if (!atqw.b) {
                        throw b;
                    }
                    throw atwf.a(b, (atml)atly);
                }
            } while (super.u(w) < 0);
            final atsb atsb = new atsb(auac.d(atly), (atsf)this);
            ((atpz)atsb).t();
            ((atpy)atsb).b((atng)new atri(this.tM((atng)new atsm((atpz)atsb))));
            final Object o = ((atpz)atsb).h();
            final atmf a2 = atmf.a;
            continue;
        }
    }
    
    public final void resumeWith(Object x) {
        x = this.x(aumt.o(x));
        if (x == atsg.b) {
            return;
        }
        this.d(x);
    }
    
    public final String tL() {
        final atmd a = this.a;
        a.getClass();
        final boolean a2 = atqw.a;
        String string = null;
        if (a2) {
            final atqs atqs = (atqs)a.get((atmb)atqs.b);
            if (atqs != null) {
                if (a.get((atmb)atqt.a) != null) {
                    throw null;
                }
                final long a3 = atqs.a;
                final StringBuilder sb = new StringBuilder("coroutine#");
                sb.append(a3);
                string = sb.toString();
            }
        }
        if (string == null) {
            return atqx.a((Object)this);
        }
        final String a4 = atqx.a((Object)this);
        final StringBuilder sb2 = new StringBuilder("\"");
        sb2.append(string);
        sb2.append("\":");
        sb2.append(a4);
        return sb2.toString();
    }
}
