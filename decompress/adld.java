import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adld implements adle
{
    public final Set a;
    private final Executor b;
    
    public adld(final Executor b) {
        this.a = new CopyOnWriteArraySet();
        this.b = b;
    }
    
    @Override
    public final void a(final String s, final boolean b, final boolean b2) {
        this.b.execute(new adlb(this, s, b, b2));
    }
    
    @Override
    public final void b(final String s, final long n, final long n2) {
        this.b.execute(new adla(this, s, n, n2, 0));
    }
    
    @Override
    public final void c(final String s, final admz admz) {
        this.b.execute((Runnable)new acbp(this, s, admz, 14));
    }
    
    @Override
    public final void d(final String s, final annh annh) {
        this.b.execute((Runnable)new acbp(this, s, annh, 9));
    }
    
    @Override
    public final void e(final String s, final double n) {
        this.b.execute((Runnable)new jvh(this, s, n, 2));
    }
    
    @Override
    public final void f(final String s, final long n, final long n2, final double n3) {
        this.b.execute(new adlc(this, s, n, n2, n3, 0));
    }
    
    @Override
    public final void g(final String s, final adms adms) {
        this.b.execute((Runnable)new acbp(this, s, adms, 10));
    }
    
    @Override
    public final void h(final admv admv) {
        this.b.execute((Runnable)new adfy(this, admv, 5));
    }
    
    @Override
    public final void i(final String s, final admv admv) {
        this.b.execute((Runnable)new acbp(this, s, admv, 15));
    }
    
    @Override
    public final void j(final String s) {
        this.b.execute((Runnable)new adfy(this, s, 6));
    }
    
    @Override
    public final void k(final String s, final boolean b) {
        this.b.execute((Runnable)new hss(this, s, b, 18));
    }
    
    @Override
    public final void l(final String s, final apil apil) {
        this.b.execute((Runnable)new acbp(this, s, apil, 11));
    }
    
    @Override
    public final void m(final String s, final String s2) {
        this.b.execute((Runnable)new acbp(this, s, s2, 12));
    }
    
    @Override
    public final void n(final String s, final admu admu) {
        this.b.execute((Runnable)new acbp(this, s, admu, 13));
    }
    
    @Override
    public final void o(final String s, final int n) {
        this.b.execute((Runnable)new wsx(this, s, n, 7));
    }
    
    public final void p(final adle adle) {
        this.a.add(adle);
    }
    
    public final void q(final adle adle) {
        this.a.remove(adle);
    }
}
