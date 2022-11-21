import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absc
{
    public afbh a;
    public String b;
    private final tnz c;
    private final atlt d;
    private final atlt e;
    private final vbs f;
    
    public absc(final tnz c, final atlt d, final atlt e, final vbs f) {
        this.a = afag.a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ListenableFuture a() {
        if (this.f.bh()) {
            this.d.tt((Object)this.a);
            final String b = this.b;
            if (b != null) {
                if (!b.isEmpty()) {
                    this.e.tt((Object)afbh.k(this.b));
                }
                else {
                    this.e.tt((Object)afag.a);
                }
            }
            return afxe.a;
        }
        return this.c.b((afax)new ablz(this, 5));
    }
    
    public final void b(final Boolean b) {
        this.a = afbh.j(b);
    }
}
