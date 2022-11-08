// 
// Decompiled by Procyon v0.6.0
// 

public final class jld implements adef
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public jld(final int a) {
        this.a = a;
        this.b = akyf.b;
    }
    
    public jld(final atjj b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vtg vtg) {
        if (this.a != 0) {
            vtg.z = aexq.k(this.b);
            return;
        }
        final jkq jkq = (jkq)((atjj)this.b).a();
        if (jkq != null) {
            if (jkq.c()) {
                vtg.y = aexq.k((Object)new vtf(jkq.b(), jkq.a()));
            }
        }
    }
}
