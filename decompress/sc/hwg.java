// 
// Decompiled by Procyon v0.6.0
// 

public final class hwg implements acop
{
    final Object a;
    private final int b;
    
    public hwg(final acoz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hwg(final goq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hwg(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hwg(final kwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final dbj dbj, final acaa acaa) {
        final int b = this.b;
        if (b == 0) {
            hxw.a(((hwl)this.a).pF(), (String)((hwl)this.a).aN.a((Throwable)dbj).c);
            if (dbj instanceof dba) {
                ((hwl)this.a).bd.b();
            }
            final jyk bf = ((hwl)this.a).bF;
            if (bf != null && bf.m()) {
                bf.j();
            }
            ((hwl)this.a).bG.g(false);
            ((hwl)this.a).bO.a("Continuation request failed. Error: ".concat(String.valueOf(String.valueOf(dbj))), (Exception)null);
            return;
        }
        if (b == 1) {
            ((goq)this.a).a.e((Throwable)dbj);
            return;
        }
        if (b != 2) {
            final acop g = ((acov)this.a).G;
            if (g != null) {
                g.a(dbj, acaa);
            }
            return;
        }
        final Object a = this.a;
        kwb.h(((uuh)a).p, (String)((kwb)a).a.a((Throwable)dbj).c);
        if (dbj instanceof dbc) {
            ((kwb)this.a).c.b();
        }
    }
}
