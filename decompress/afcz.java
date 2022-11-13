import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afcz
{
    public static final afcz b;
    public static final afcz c;
    public static final afcz d;
    
    static {
        b = (afcz)new afcx();
        c = (afcz)new afcy(-1);
        d = (afcz)new afcy(1);
    }
    
    public abstract int a();
    
    public abstract afcz b(final int p0, final int p1);
    
    public abstract afcz c(final Comparable p0, final Comparable p1);
    
    public abstract afcz d(final Object p0, final Object p1, final Comparator p2);
    
    public abstract afcz e(final boolean p0, final boolean p1);
    
    public abstract afcz f(final boolean p0, final boolean p1);
}
