import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class bn extends bq
{
    final /* synthetic */ sc a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ rl c;
    final /* synthetic */ rd d;
    final /* synthetic */ br e;
    
    public bn(final br e, final sc a, final AtomicReference b, final rl c, final rd d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final br e = this.e;
        final StringBuilder sb = new StringBuilder("fragment_");
        sb.append(e.l);
        sb.append("_rq#");
        sb.append(e.ac.getAndIncrement());
        this.b.set(((ri)this.a.a((Object)null)).b(sb.toString(), (aum)this.e, this.c, this.d));
    }
}
