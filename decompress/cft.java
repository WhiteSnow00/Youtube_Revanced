// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cft extends cgb
{
    public cft(final cfw cfw) {
        super(cfw);
    }
    
    public final void a(final Object o) {
        final chf d = this.d();
        try {
            this.b(d, o);
            d.a();
        }
        finally {
            this.f(d);
        }
    }
    
    public abstract void b(final chf p0, final Object p1);
}
