import java.util.Collection;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqj extends aesy
{
    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }
    
    public static double[] bb(final Collection collection) {
        final Object[] array = collection.toArray();
        final int length = array.length;
        final double[] array2 = new double[length];
        for (int i = 0; i < length; ++i) {
            final Object o = array[i];
            o.getClass();
            array2[i] = ((Number)o).doubleValue();
        }
        return array2;
    }
    
    public static double bc(final double n) {
        return Math.min(Math.max(n, 1.0), 30.0);
    }
}
