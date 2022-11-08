// 
// Decompiled by Procyon v0.6.0
// 

final class aryh
{
    static final aryg a;
    private final asfh b;
    private final asbh c;
    private final asbh d;
    private final asbh e;
    private volatile long f;
    
    static {
        a = (aryg)new aryf();
    }
    
    public aryh(final asfh b) {
        this.c = arxi.a();
        this.d = arxi.a();
        this.e = arxi.a();
        this.b = b;
    }
    
    public final void a(final boolean b) {
        if (b) {
            this.d.a();
            return;
        }
        this.e.a();
    }
    
    public final void b() {
        this.c.a();
        this.f = this.b.a();
    }
}
