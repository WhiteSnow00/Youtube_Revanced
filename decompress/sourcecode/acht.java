// 
// Decompiled by Procyon v0.6.0
// 

public final class acht
{
    private static final acht b;
    public final int a;
    
    static {
        b = new acht(0, 1);
    }
    
    public acht(final int n, final int a) {
        final boolean b = true;
        agot.u(n >= 0);
        agot.u(a > n && b);
        this.a = a;
    }
    
    public static final acht a(final acij acij) {
        final Object c = acij.c("rowData");
        if (c instanceof acht) {
            return (acht)c;
        }
        return acht.b;
    }
    
    public final boolean b() {
        return this.a == 1;
    }
}
