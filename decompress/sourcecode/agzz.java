import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agzz
{
    static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;
    
    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final byte[] array = b = new byte[0];
        c = ByteBuffer.wrap(array);
        agyh.O(array);
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int b(final byte[] array) {
        final int length = array.length;
        int d;
        if ((d = d(length, array, 0, length)) == 0) {
            d = 1;
        }
        return d;
    }
    
    public static int c(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    static int d(int n, final byte[] array, final int n2, final int n3) {
        for (int i = n2; i < n2 + n3; ++i) {
            n = n * 31 + array[i];
        }
        return n;
    }
    
    static Object e(final Object o, final Object o2) {
        return ((MessageLite)o).toBuilder().mergeFrom((MessageLite)o2).buildPartial();
    }
    
    public static String f(final byte[] array) {
        return new String(array, agzz.a);
    }
    
    public static boolean g(final byte[] array) {
        final aeda a = ahcl.a;
        return aeda.aA(array, 0, array.length);
    }
    
    static void h(final Object o) {
        o.getClass();
    }
    
    public static void i(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    static void j(final MessageLite messageLite) {
        if (!(messageLite instanceof agxm)) {
            return;
        }
        final agxm agxm = (agxm)messageLite;
        throw null;
    }
}
