import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afib implements Comparator
{
    protected afib() {
    }
    
    public static afib d(final Comparator comparator) {
        Object o;
        if (comparator instanceof afib) {
            o = comparator;
        }
        else {
            o = new afcw(comparator);
        }
        return (afib)o;
    }
    
    public afib a() {
        return (afib)new afhx(this);
    }
    
    public afib b() {
        return (afib)new afhy(this);
    }
    
    public afib c() {
        return (afib)new afit(this);
    }
    
    @Override
    public abstract int compare(final Object p0, final Object p1);
}
