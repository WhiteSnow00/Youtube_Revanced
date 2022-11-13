// 
// Decompiled by Procyon v0.6.0
// 

public final class acjw
{
    private static final acjw b;
    public final int a;
    
    static {
        b = new acjw(0, 1);
    }
    
    public acjw(final int n, final int a) {
        final boolean b = true;
        adkp.H(n >= 0);
        adkp.H(a > n && b);
        this.a = a;
    }
    
    public static final acjw a(final ackm ackm) {
        final Object c = ackm.c("rowData");
        if (c instanceof acjw) {
            return (acjw)c;
        }
        return acjw.b;
    }
    
    public final boolean b() {
        return this.a == 1;
    }
}
