// 
// Decompiled by Procyon v0.6.0
// 

final class assk extends asse
{
    private static final long serialVersionUID = -5898283885385201806L;
    final int d;
    
    public assk() {
        this.d = 1;
    }
    
    public final void d() {
        if (this.b <= this.d) {
            return;
        }
        final assg assg = (assg)((assg)this.get()).get();
        if (assg != null) {
            --super.b;
            this.set((Object)assg);
            return;
        }
        throw new IllegalStateException("Empty list!");
    }
}
