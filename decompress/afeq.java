import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afeq
{
    public static final afeq b;
    public static final afeq c;
    public static final afeq d;
    
    static {
        b = new afeo();
        c = new afep(-1);
        d = new afep(1);
    }
    
    public abstract int a();
    
    public abstract afeq b(final int p0, final int p1);
    
    public abstract afeq c(final Comparable p0, final Comparable p1);
    
    public abstract afeq d(final Object p0, final Object p1, final Comparator p2);
    
    public abstract afeq e(final boolean p0, final boolean p1);
    
    public abstract afeq f(final boolean p0, final boolean p1);
}
