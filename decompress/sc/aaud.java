import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public interface aaud
{
    public static final Range a = new Range((Comparable)value, (Comparable)1.0);
    public static final Range b = new Range((Comparable)value, (Comparable)Double.MAX_VALUE);
    
    default static {
        final Double value = 0.0;
    }
    
    double a(final double p0);
    
    double b();
    
    double c(final double p0);
    
    boolean d();
}
