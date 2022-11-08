// 
// Decompiled by Procyon v0.6.0
// 

final class abew implements znj
{
    final /* synthetic */ abey a;
    private final znj b;
    
    public abew(final abey a, final znj b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final dbi dbi) {
        final abey a = this.a;
        final int c = a.c + 1;
        a.c = c;
        if (c > 3) {
            a.c = 0;
            this.b.a(dbi);
            this.a.b();
            return;
        }
        abey.e(a.b, a.a);
        final abey a2 = this.a;
        a2.c(a2.b);
    }
}
