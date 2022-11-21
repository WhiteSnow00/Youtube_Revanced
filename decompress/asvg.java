// 
// Decompiled by Procyon v0.6.0
// 

final class asvg extends asva
{
    private static final long serialVersionUID = -5898283885385201806L;
    final int d;
    
    public asvg() {
        this.d = 1;
    }
    
    @Override
    public final void d() {
        if (this.b <= this.d) {
            return;
        }
        final asvc asvc = this.get().get();
        if (asvc != null) {
            --super.b;
            this.set(asvc);
            return;
        }
        throw new IllegalStateException("Empty list!");
    }
}
