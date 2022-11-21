import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class bn extends bq
{
    final sd a;
    final AtomicReference b;
    final rm c;
    final re d;
    final br e;
    
    public bn(final br e, final sd a, final AtomicReference b, final rm c, final re d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        final br e = this.e;
        final StringBuilder sb = new StringBuilder("fragment_");
        sb.append(e.l);
        sb.append("_rq#");
        sb.append(e.ac.getAndIncrement());
        this.b.set(((rj)this.a.a((Object)null)).b(sb.toString(), (aup)this.e, this.c, this.d));
    }
}
