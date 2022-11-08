import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adea implements addw
{
    public final addz a;
    public final adcg b;
    public final adcb c;
    public final String d;
    public final String e;
    public ListenableFuture f;
    private final afss g;
    
    public adea(final vjl vjl, final adcg b) {
        this.g = afss.a();
        this.a = new addz(vjl);
        this.b = b;
        this.d = "yqfe0p";
        this.e = "yqfe-zp.cache";
        this.c = adcb.a("AppGlobalScope", "yqfe0p", "yqfe-zp.cache");
    }
    
    public final ListenableFuture a(final String s) {
        if (s != null && s.isEmpty()) {
            return this.g.b((afrx)new qpp(this, 12), (Executor)afsl.a);
        }
        return afva.m(null);
    }
    
    public final void b(final String s, final agmd agmd) {
        if (s != null) {
            if (s.isEmpty()) {
                tcp.m(this.g.b((afrx)new adcd(this, agmd, 5, null), (Executor)afsl.a), (tcn)new xna(this, 10));
            }
        }
    }
    
    public final void c() {
        tcp.m(this.g.b((afrx)new qpp(this, 13), (Executor)afsl.a), (tcn)new xna(this, 11));
    }
}
