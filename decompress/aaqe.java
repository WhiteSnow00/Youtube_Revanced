import android.animation.TypeEvaluator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqe implements TypeEvaluator
{
    public static final aaqe a;
    private final int b;
    
    static {
        a = new aaqe(1);
    }
    
    public aaqe(final int b) {
        this.b = b;
    }
    
    public final Object evaluate(final float n, final Object o, final Object o2) {
        if (this.b != 0) {
            final Integer n2 = (Integer)o;
            final Integer n3 = (Integer)o2;
            final int intValue = n2;
            final int n4 = intValue & 0xFF;
            final int intValue2 = n3;
            final int n5 = intValue >> 24 & 0xFF;
            final float n6 = (float)((intValue2 >> 24 & 0xFF) - n5);
            final int n7 = intValue >> 16 & 0xFF;
            final float n8 = (float)((intValue2 >> 16 & 0xFF) - n7);
            final int n9 = intValue >> 8 & 0xFF;
            return n5 + (int)(n6 * n) << 24 | n7 + (int)(n8 * n) << 16 | n9 + (int)(((intValue2 >> 8 & 0xFF) - n9) * n) << 8 | n4 + (int)(n * ((intValue2 & 0xFF) - n4));
        }
        final Long n10 = (Long)o;
        final Long n11 = (Long)o2;
        final double n12 = n10;
        final long longValue = n11;
        final long longValue2 = n10;
        final double n13 = n;
        final double n14 = (double)(longValue - longValue2);
        Double.isNaN(n13);
        Double.isNaN(n14);
        Double.isNaN(n12);
        return (long)(n12 + n13 * n14);
    }
}
