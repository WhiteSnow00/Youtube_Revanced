import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryb
{
    public static final Charset a;
    public static final afqo b;
    
    static {
        a = Charset.forName("US-ASCII");
        b = arze.d;
    }
    
    public static int a(final arze arze) {
        return arze.f;
    }
    
    public static aryz b(final String s, final arya arya) {
        final boolean empty = s.isEmpty();
        boolean b = false;
        if (!empty) {
            b = b;
            if (s.charAt(0) == ':') {
                b = true;
            }
        }
        return aryz.e(s, b, (arzd)arya);
    }
    
    public static arze c(final byte[]... array) {
        return new arze(array.length >> 1, array);
    }
    
    public static arze d(final int n, final Object[] array) {
        return new arze(n, array);
    }
    
    public static Object[] e(final arze arze) {
        final Object[] array = new Object[arze.a()];
        for (int i = 0; i < arze.f; ++i) {
            final byte[] g = arze.g(i);
            final int n = i + i;
            array[n] = g;
            Object o2;
            final Object o = o2 = arze.c(i);
            if (!(o instanceof byte[])) {
                o2 = ((arzb)o).b();
            }
            array[n + 1] = o2;
        }
        return array;
    }
    
    public static byte[][] f(final arze arze) {
        final byte[][] array = new byte[arze.a()][];
        final Object[] e = arze.e;
        final boolean b = e instanceof byte[][];
        int i = 0;
        if (b) {
            System.arraycopy(e, 0, array, 0, arze.a());
        }
        else {
            while (i < arze.f) {
                final byte[] g = arze.g(i);
                final int n = i + i;
                array[n] = g;
                array[n + 1] = arze.i(i);
                ++i;
            }
        }
        return array;
    }
}
