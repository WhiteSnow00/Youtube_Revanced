import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlp implements eue
{
    private final wwu a;
    private final atjj b;
    private final atjj c;
    private final Executor d;
    
    public hlp(final wwu a, final atjj b, final atjj c, final Executor d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final eum a() {
        return new hlo((abzk)this.b.a(), this.a.n(), this.d, ((arjh)this.c).b());
    }
}
