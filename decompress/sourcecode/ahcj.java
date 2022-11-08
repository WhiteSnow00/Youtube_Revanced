import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import libcore.io.Memory;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahcj
{
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class f;
    private static final boolean g;
    private static final ahci h;
    private static final long i;
    
    static {
        final Unsafe unsafe = e = k();
        f = Memory.class;
        final boolean b2 = g = w(Long.TYPE);
        boolean w = w(Integer.TYPE);
        Object h2 = null;
        if (unsafe != null) {
            if (b2) {
                h2 = new ahch(unsafe);
            }
            else if (w) {
                h2 = new ahcg(unsafe);
            }
        }
        h = (ahci)h2;
        final boolean b3 = true;
        Label_0156: {
            Label_0079: {
                if (h2 != null) {
                    final Unsafe a2 = ((ahci)h2).a;
                    try {
                        final Class<? extends Unsafe> class1 = a2.getClass();
                        class1.getMethod("objectFieldOffset", Field.class);
                        class1.getMethod("getLong", Object.class, Long.TYPE);
                        if (j() == null) {
                            break Label_0079;
                        }
                        w = true;
                    }
                    finally {
                        final Throwable t;
                        m(t);
                        break Label_0079;
                    }
                    break Label_0156;
                }
            }
            w = false;
        }
        a = w;
        final ahci h3 = ahcj.h;
        Label_0393: {
            Label_0168: {
                if (h3 != null) {
                    final Unsafe a3 = h3.a;
                    try {
                        final Class<? extends Unsafe> class2 = a3.getClass();
                        class2.getMethod("objectFieldOffset", Field.class);
                        class2.getMethod("arrayBaseOffset", Class.class);
                        class2.getMethod("arrayIndexScale", Class.class);
                        class2.getMethod("getInt", Object.class, Long.TYPE);
                        class2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                        class2.getMethod("getLong", Object.class, Long.TYPE);
                        class2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                        class2.getMethod("getObject", Object.class, Long.TYPE);
                        class2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                        w = true;
                    }
                    finally {
                        final Throwable t2;
                        m(t2);
                        break Label_0168;
                    }
                    break Label_0393;
                }
            }
            w = false;
        }
        b = w;
        c = A(byte[].class);
        A(boolean[].class);
        C(boolean[].class);
        A(int[].class);
        C(int[].class);
        A(long[].class);
        C(long[].class);
        A(float[].class);
        C(float[].class);
        A(double[].class);
        C(double[].class);
        A(Object[].class);
        C(Object[].class);
        final Field j = j();
        long m = -1L;
        if (j != null) {
            final ahci h4 = ahcj.h;
            if (h4 == null) {
                m = m;
            }
            else {
                m = h4.m(j);
            }
        }
        i = m;
        d = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b3);
    }
    
    private ahcj() {
    }
    
    private static int A(final Class clazz) {
        if (ahcj.b) {
            return ahcj.h.j(clazz);
        }
        return -1;
    }
    
    private static Field B(final Class clazz, final String s) {
        Field field;
        try {
            clazz.getDeclaredField(s);
        }
        finally {
            field = null;
        }
        return field;
    }
    
    private static void C(final Class clazz) {
        if (ahcj.b) {
            ahcj.h.r(clazz);
        }
    }
    
    static byte a(final long n) {
        return ahcj.h.a(n);
    }
    
    static double b(final Object o, final long n) {
        return ahcj.h.b(o, n);
    }
    
    static float c(final Object o, final long n) {
        return ahcj.h.c(o, n);
    }
    
    static int d(final Object o, final long n) {
        return ahcj.h.k(o, n);
    }
    
    static long e(final ByteBuffer byteBuffer) {
        return ahcj.h.l(byteBuffer, ahcj.i);
    }
    
    static long f(final Object o, final long n) {
        return ahcj.h.l(o, n);
    }
    
    static long g(final Field field) {
        return ahcj.h.m(field);
    }
    
    static Object h(final Class clazz) {
        try {
            return ahcj.e.allocateInstance(clazz);
        }
        catch (final InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    static Object i(final Object o, final long n) {
        return ahcj.h.n(o, n);
    }
    
    public static Field j() {
        Field b;
        if ((b = B(Buffer.class, "effectiveDirectAddress")) == null) {
            final Field b2 = B(Buffer.class, "address");
            if (b2 != null && b2.getType() == Long.TYPE) {
                return b2;
            }
            b = null;
        }
        return b;
    }
    
    static Unsafe k() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new ahcf());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    static void l(final long n, final byte[] array, final long n2, final long n3) {
        ahcj.h.d(n, array, n2, n3);
    }
    
    public static void m(final Throwable t) {
        Logger.getLogger(ahcj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(t.toString()));
    }
    
    static void n(final Object o, final long n, final boolean b) {
        ahcj.h.e(o, n, b);
    }
    
    static void o(final byte[] array, final long n, final byte b) {
        ahcj.h.f(array, ahcj.c + n, b);
    }
    
    public static void p(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int n3 = (~(int)n & 0x3) << 3;
        t(o, n2, (b & 0xFF) << n3 | (d(o, n2) & ~(255 << n3)));
    }
    
    public static void q(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final int n3 = ((int)n & 0x3) << 3;
        t(o, n2, (b & 0xFF) << n3 | (d(o, n2) & ~(255 << n3)));
    }
    
    static void r(final Object o, final long n, final double n2) {
        ahcj.h.g(o, n, n2);
    }
    
    static void s(final Object o, final long n, final float n2) {
        ahcj.h.h(o, n, n2);
    }
    
    static void t(final Object o, final long n, final int n2) {
        ahcj.h.o(o, n, n2);
    }
    
    static void u(final Object o, final long n, final long n2) {
        ahcj.h.p(o, n, n2);
    }
    
    static void v(final Object o, final long n, final Object o2) {
        ahcj.h.q(o, n, o2);
    }
    
    static boolean w(final Class clazz) {
        try {
            final Class f = ahcj.f;
            f.getMethod("peekLong", clazz, Boolean.TYPE);
            f.getMethod("pokeLong", clazz, Long.TYPE, Boolean.TYPE);
            f.getMethod("pokeInt", clazz, Integer.TYPE, Boolean.TYPE);
            f.getMethod("peekInt", clazz, Boolean.TYPE);
            f.getMethod("pokeByte", clazz, Byte.TYPE);
            f.getMethod("peekByte", clazz);
            f.getMethod("pokeByteArray", clazz, byte[].class, Integer.TYPE, Integer.TYPE);
            f.getMethod("peekByteArray", clazz, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        }
        finally {
            return false;
        }
    }
    
    static boolean x(final Object o, final long n) {
        return ahcj.h.i(o, n);
    }
    
    public static boolean y(final Object o, final long n) {
        return (byte)(d(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((~n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    public static boolean z(final Object o, final long n) {
        return (byte)(d(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3) & 0xFF) != 0;
    }
}
