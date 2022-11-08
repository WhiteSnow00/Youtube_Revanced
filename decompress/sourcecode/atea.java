import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atea extends ashp
{
    final ashs a;
    final long b;
    final TimeUnit c;
    final asho d;
    
    public atea(final ashs a, final long b, final TimeUnit c, final asho d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected final void ae(final ashq ashq) {
        final asjk asjk = new asjk();
        ashq.d((asic)asjk);
        this.a.ad((ashq)new atdz(this, asjk, ashq));
    }
}
