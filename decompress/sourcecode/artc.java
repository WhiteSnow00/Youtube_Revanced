import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class artc
{
    public static final Charset a;
    public static final afmy b;
    
    static {
        a = Charset.forName("US-ASCII");
        b = arug.d;
    }
    
    public static int a(final arug arug) {
        return arug.f;
    }
    
    public static arub b(final String s, final artb artb) {
        final boolean empty = s.isEmpty();
        boolean b = false;
        if (!empty) {
            b = b;
            if (s.charAt(0) == ':') {
                b = true;
            }
        }
        return arub.f(s, b, (aruf)artb);
    }
    
    public static arug c(final byte[]... array) {
        return new arug(array.length >> 1, array);
    }
    
    public static arug d(final int n, final Object[] array) {
        return new arug(n, array);
    }
    
    public static Object e(final arua arua, final Object o) {
        return new arud(arua, o);
    }
    
    public static Object[] f(final arug arug) {
        final Object[] array = new Object[arug.a()];
        for (int i = 0; i < arug.f; ++i) {
            final int n = i + i;
            array[n] = arug.g(i);
            Object o2;
            final Object o = o2 = arug.c(i);
            if (!(o instanceof byte[])) {
                o2 = ((arud)o).b();
            }
            array[n + 1] = o2;
        }
        return array;
    }
    
    public static byte[][] g(final arug arug) {
        final byte[][] array = new byte[arug.a()][];
        final Object[] e = arug.e;
        final boolean b = e instanceof byte[][];
        int i = 0;
        if (b) {
            System.arraycopy(e, 0, array, 0, arug.a());
        }
        else {
            while (i < arug.f) {
                final int n = i + i;
                array[n] = arug.g(i);
                array[n + 1] = arug.i(i);
                ++i;
            }
        }
        return array;
    }
}
