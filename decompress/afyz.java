import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyz implements Comparable
{
    private final byte[] a;
    
    public afyz(final byte[] array) {
        this.a = Arrays.copyOf(array, array.length);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final afyz afyz = (afyz)o;
        final int length = this.a.length;
        final int length2 = afyz.a.length;
        int n;
        if (length != length2) {
            n = length - length2;
        }
        else {
            final int n2 = 0;
            int n3 = 0;
            while (true) {
                final byte[] a = this.a;
                n = n2;
                if (n3 >= a.length) {
                    break;
                }
                final byte b = a[n3];
                final byte b2 = afyz.a[n3];
                if (b != b2) {
                    n = b - b2;
                    break;
                }
                ++n3;
            }
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof afyz && Arrays.equals(this.a, ((afyz)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return aexq.s(this.a);
    }
}
