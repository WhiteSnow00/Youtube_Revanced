// 
// Decompiled by Procyon v0.6.0
// 

public final class aclj
{
    private static final aclj b;
    public final int a;
    
    static {
        b = new aclj(0, 1);
    }
    
    public aclj(final int n, final int a) {
        final boolean b = true;
        adme.K(n >= 0);
        adme.K(a > n && b);
        this.a = a;
    }
    
    public static final aclj a(final aclz aclz) {
        final Object c = aclz.c("rowData");
        if (c instanceof aclj) {
            return (aclj)c;
        }
        return aclj.b;
    }
    
    public final boolean b() {
        return this.a == 1;
    }
}
