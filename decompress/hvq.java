// 
// Decompiled by Procyon v0.6.0
// 

public final class hvq implements ashr
{
    public final Object a;
    private final int b;
    
    public hvq(final ashc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvq(final asie a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvq(final hzj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ashq a(final ashn ashn) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final int cu = hwl.cU;
            return (ashq)ashn.N((ashq)((asie)a).i().H((ashq)ashn.D()));
        }
        if (b == 1) {
            return (ashq)ashn.N((ashq)((asie)this.a).i().H((ashq)ashn.D()));
        }
        if (b != 2) {
            return (ashq)ashn.N((ashq)((ashc)this.a).O().n(new Object()));
        }
        return (ashq)ashn.L(((hzj)this.a).h);
    }
}
