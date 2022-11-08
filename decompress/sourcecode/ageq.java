import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageq
{
    public final byte[] a;
    
    private ageq(final byte[] array, final int n) {
        System.arraycopy(array, 0, this.a = new byte[n], 0, n);
    }
    
    public static ageq a(final byte[] array) {
        if (array != null) {
            return new ageq(array, array.length);
        }
        throw new NullPointerException("data must be non-null");
    }
    
    public final byte[] b() {
        final byte[] a = this.a;
        final int length = a.length;
        final byte[] array = new byte[length];
        System.arraycopy(a, 0, array, 0, length);
        return array;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ageq && Arrays.equals(((ageq)o).a, this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final String y = aety.y(this.a);
        final StringBuilder sb = new StringBuilder("Bytes(");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
}
