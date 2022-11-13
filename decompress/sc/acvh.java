// 
// Decompiled by Procyon v0.6.0
// 

public final class acvh implements acvi
{
    public static final acvh a;
    public static final acvh b;
    private final int c;
    
    static {
        b = new acvh(1);
        a = new acvh(0);
    }
    
    private acvh(final int c) {
        this.c = c;
    }
    
    public final int a(final int n, final int n2) {
        if (this.c != 0) {
            return n;
        }
        return n2;
    }
}
