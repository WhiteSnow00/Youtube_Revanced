// 
// Decompiled by Procyon v0.6.0
// 

final class ebq extends dst
{
    public ebq() {
        super("EmptyComponent");
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final dst c(final dsx dsx) {
        return dsn.b(dsx).a;
    }
    
    public final boolean f(final dst dst) {
        boolean b = true;
        if (this != dst) {
            if (dst != null) {
                if (this.getClass() != dst.getClass()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
