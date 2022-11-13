import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgc implements adfx
{
    public final adgb a;
    public final adei b;
    public final aded c;
    public final String d;
    public final String e;
    public ListenableFuture f;
    private final afut g;
    
    public adgc(final vlq vlq, final adei b) {
        this.g = afut.a();
        this.a = new adgb(vlq);
        this.b = b;
        this.d = "yqfe0p";
        this.e = "yqfe-zp.cache";
        this.c = aded.a("AppGlobalScope", "yqfe0p", "yqfe-zp.cache");
    }
    
    public final ListenableFuture a(final String s) {
        if (s != null && s.isEmpty()) {
            return this.g.b((afty)new qqz(this, 12), (Executor)afum.a);
        }
        return afwm.m((Object)null);
    }
    
    public final void b(final String s, final agoe agoe) {
        if (s != null) {
            if (s.isEmpty()) {
                teu.m(this.g.b((afty)new adef(this, agoe, 4, null), (Executor)afum.a), (tes)new wyh(this, 12));
            }
        }
    }
    
    public final void c() {
        teu.m(this.g.b((afty)new qqz(this, 13), (Executor)afum.a), (tes)new wyh(this, 13));
    }
}
