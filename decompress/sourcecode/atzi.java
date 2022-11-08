import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atzi
{
    public static final void a(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        final StringBuilder sb = new StringBuilder("size=");
        sb.append(n);
        sb.append(" offset=");
        sb.append(n2);
        sb.append(" byteCount=");
        sb.append(n3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final boolean b(final byte[] array, final int n, final byte[] array2, final int n2, final int n3) {
        array.getClass();
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static final byte[] c(final String s) {
        final byte[] bytes = s.getBytes(aton.a);
        bytes.getClass();
        return bytes;
    }
    
    public static final Integer d(final int n) {
        return new Integer(n);
    }
}
