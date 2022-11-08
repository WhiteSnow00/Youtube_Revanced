// 
// Decompiled by Procyon v0.6.0
// 

public final class cnq implements cmw
{
    public final ctj c;
    private final aux d;
    
    public cnq() {
        this.d = new aux();
        this.c = ctj.f();
        this.a(cmw.b);
    }
    
    public final void a(final cll cll) {
        this.d.k((Object)cll);
        if (cll instanceof cmv) {
            this.c.g((Object)cll);
            return;
        }
        if (cll instanceof cmt) {
            this.c.d(((cmt)cll).a);
        }
    }
}
