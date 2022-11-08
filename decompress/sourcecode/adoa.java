import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoa extends adjq
{
    public final AtomicBoolean b;
    public final asjd c;
    public final adcr d;
    private final int e;
    private final Executor f;
    private asic g;
    private final ashe h;
    
    public adoa(final Executor f, final adcr d, final int n, final int e, final adit adit, final String s, final asjd c, final byte[] array) {
        super(n);
        this.f = f;
        this.d = d;
        this.e = e;
        this.c = c;
        final ashe h = adit.a.get(s);
        h.getClass();
        this.h = h;
        this.b = new AtomicBoolean();
    }
    
    protected final void e() {
        this.g = this.h.aj(atio.b(this.f)).aa(atio.b(this.f)).aD((asix)new adjm(this, 10), (asix)new adjm(this, 11), (asir)new tlv(this, 20));
    }
    
    public final void f() {
        final asic g = this.g;
        if (g != null) {
            asjg.b((AtomicReference)g);
        }
    }
    
    public final adkc g() {
        asjg.b((AtomicReference)this.h.al(1L).aC((asix)new adjm(this, 12), (asix)new adjm(this, 13)));
        adkc adkc;
        if (this.b.get()) {
            adkc = adkc.a;
        }
        else {
            adkc = adkc.a(this.e);
        }
        return adkc;
    }
}
