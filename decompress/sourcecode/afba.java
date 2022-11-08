import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afba
{
    public static final afba b;
    public static final afba c;
    public static final afba d;
    
    static {
        b = (afba)new afay();
        c = (afba)new afaz(-1);
        d = (afba)new afaz(1);
    }
    
    public abstract int a();
    
    public abstract afba b(final int p0, final int p1);
    
    public abstract afba c(final Comparable p0, final Comparable p1);
    
    public abstract afba d(final Object p0, final Object p1, final Comparator p2);
    
    public abstract afba e(final boolean p0, final boolean p1);
    
    public abstract afba f(final boolean p0, final boolean p1);
}
