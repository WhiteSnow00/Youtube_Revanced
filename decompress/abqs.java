import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqs
{
    public aezp a;
    public String b;
    private final tmx c;
    private final atiw d;
    private final atiw e;
    private final vai f;
    
    public abqs(final tmx c, final atiw d, final atiw e, final vai f) {
        this.a = (aezp)aeyo.a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ListenableFuture a() {
        if (this.f.be()) {
            this.d.tu((Object)this.a);
            final String b = this.b;
            if (b != null) {
                if (!b.isEmpty()) {
                    this.e.tu((Object)aezp.k((Object)this.b));
                }
                else {
                    this.e.tu((Object)aeyo.a);
                }
            }
            return afvn.a;
        }
        return this.c.b((aezf)new abkr(this, 6));
    }
    
    public final void b(final Boolean b) {
        this.a = aezp.j((Object)b);
    }
}
