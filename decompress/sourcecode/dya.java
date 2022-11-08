// 
// Decompiled by Procyon v0.6.0
// 

public final class dya implements dxy
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public dya(final dxj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dya(final dyb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final dxx dxx) {
        if (this.b != 0) {
            ((dxj)this.a).d.remove(dxx);
            return;
        }
        ((dyb)this.a).k(dxx);
    }
    
    @Override
    public final void c(final dxx dxx) {
        if (this.b != 0) {
            ((dxj)this.a).d.remove(dxx);
            return;
        }
        ((dyb)this.a).k(dxx);
    }
    
    @Override
    public final void d(final dxx dxx) {
        if (this.b != 0) {
            ((dxj)this.a).d.add(dxx);
        }
    }
    
    @Override
    public final boolean e(final dxx dxx) {
        return true;
    }
}
