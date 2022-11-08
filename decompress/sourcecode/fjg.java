// 
// Decompiled by Procyon v0.6.0
// 

public final class fjg implements znj
{
    final /* synthetic */ atdw a;
    
    public fjg(final atdw a) {
        this.a = a;
    }
    
    public final void a(final dbi dbi) {
        if (!this.a.tx()) {
            this.a.a((Throwable)dbi);
        }
    }
    
    public final void mX(final Object o) {
        if (!this.a.tx()) {
            o.getClass();
            this.a.b(o);
        }
    }
}
