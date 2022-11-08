// 
// Decompiled by Procyon v0.6.0
// 

final class asrv extends asrp
{
    private static final long serialVersionUID = -5898283885385201806L;
    final int d;
    
    public asrv() {
        this.d = 1;
    }
    
    @Override
    public final void d() {
        if (this.b <= this.d) {
            return;
        }
        final asrr asrr = this.get().get();
        if (asrr != null) {
            --super.b;
            this.set(asrr);
            return;
        }
        throw new IllegalStateException("Empty list!");
    }
}
