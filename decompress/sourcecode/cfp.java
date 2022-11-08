// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cfp extends cfx
{
    public cfp(final cfs cfs) {
        super(cfs);
    }
    
    public final void a(final Object o) {
        final chb d = this.d();
        try {
            this.b(d, o);
            d.a();
        }
        finally {
            this.f(d);
        }
    }
    
    public abstract void b(final chb p0, final Object p1);
}
