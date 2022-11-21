// 
// Decompiled by Procyon v0.6.0
// 

public final class acwu implements acwv
{
    public static final acwu a;
    public static final acwu b;
    private final int c;
    
    static {
        b = new acwu(1);
        a = new acwu(0);
    }
    
    private acwu(final int c) {
        this.c = c;
    }
    
    @Override
    public final int a(final int n, final int n2) {
        if (this.c != 0) {
            return n;
        }
        return n2;
    }
}
