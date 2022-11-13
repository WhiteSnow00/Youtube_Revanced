import java.util.Iterator;
import java.util.Collection;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.lang.annotation.Annotation;
import java.io.OutputStream;
import java.util.Map;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agkj implements agkc
{
    public static final agka a;
    public static final agka b;
    private static final Charset d;
    private static final agkb e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final agkb h;
    private final agpc i;
    
    static {
        d = Charset.forName("UTF-8");
        final aglu b2 = agka.b("key");
        b2.d((Annotation)agpc.z(1, agkh.a));
        a = b2.c();
        final aglu b3 = agka.b("value");
        b3.d((Annotation)agpc.z(2, agkh.a));
        b = b3.c();
        e = agkk.b;
    }
    
    public agkj(final OutputStream f, final Map c, final Map g, final agkb h) {
        this.i = new agpc();
        this.f = f;
        this.c = c;
        this.g = g;
        this.h = h;
    }
    
    private static int g(final agka agka) {
        final agki agki = (agki)agka.a((Class)agki.class);
        if (agki != null) {
            return agki.a();
        }
        throw new agjz("Field has no @Protobuf config");
    }
    
    private static agki h(final agka agka) {
        final agki agki = (agki)agka.a((Class)agki.class);
        if (agki != null) {
            return agki;
        }
        throw new agjz("Field has no @Protobuf config");
    }
    
    private static ByteBuffer i(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    private final void j(int n) {
        OutputStream f;
        while (true) {
            final long n2 = n & 0xFFFFFF80;
            f = this.f;
            if (n2 == 0L) {
                break;
            }
            f.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        f.write(n & 0x7F);
    }
    
    private final void k(long n) {
        OutputStream f;
        while (true) {
            f = this.f;
            if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
                break;
            }
            f.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        f.write((int)n & 0x7F);
    }
    
    private final void l(final agkb agkb, final agka agka, final Object o, final boolean b) {
        final agkf f = new agkf();
        try {
            final OutputStream f2 = this.f;
            this.f = (OutputStream)f;
            try {
                agkb.a(o, (Object)this);
                this.f = f2;
                final long a = f.a;
                f.close();
                if (b && a == 0L) {
                    return;
                }
                this.j(g(agka) << 3 | 0x2);
                this.k(a);
                agkb.a(o, (Object)this);
            }
            finally {
                this.f = f2;
            }
        }
        finally {
            Label_0135: {
                final Throwable t2;
                try {
                    f.close();
                    break Label_0135;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final agkb agkb2 = agkb;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(agkb2, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final agkb agkb2 = agkb;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t = t2;
                    array2[n4] = t;
                    method.invoke(agkb2, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    public final /* bridge */ void a(final agka agka, final long n) {
        this.d(agka, n, true);
    }
    
    public final void b(final agka agka, final Object o) {
        this.f(agka, o, true);
    }
    
    final void c(final agka agka, final int n, final boolean b) {
        if (b && n == 0) {
            return;
        }
        final agki h = h(agka);
        final agkh a = agkh.a;
        final int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            this.j(h.a() << 3);
            this.j(n);
            return;
        }
        if (ordinal == 1) {
            this.j(h.a() << 3);
            this.j(n + n ^ n >> 31);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        this.j(h.a() << 3 | 0x5);
        this.f.write(i(4).putInt(n).array());
    }
    
    final void d(final agka agka, final long n, final boolean b) {
        if (b && n == 0L) {
            return;
        }
        final agki h = h(agka);
        final agkh a = agkh.a;
        final int ordinal = h.b().ordinal();
        if (ordinal == 0) {
            this.j(h.a() << 3);
            this.k(n);
            return;
        }
        if (ordinal == 1) {
            this.j(h.a() << 3);
            this.k(n >> 63 ^ n + n);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        this.j(h.a() << 3 | 0x1);
        this.f.write(i(8).putLong(n).array());
    }
    
    public final void e(final agka agka, final int n) {
        this.c(agka, n, true);
    }
    
    final void f(final agka agka, final Object o, final boolean b) {
        if (o == null) {
            return;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return;
            }
            this.j(g(agka) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(agkj.d);
            this.j(bytes.length);
            this.f.write(bytes);
        }
        else {
            if (o instanceof Collection) {
                final Iterator iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.f(agka, iterator.next(), false);
                }
                return;
            }
            if (o instanceof Map) {
                final Iterator iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.l(agkj.e, agka, iterator2.next(), false);
                }
                return;
            }
            if (o instanceof Double) {
                final double doubleValue = (double)o;
                if (b && doubleValue == 0.0) {
                    return;
                }
                this.j(g(agka) << 3 | 0x1);
                this.f.write(i(8).putDouble(doubleValue).array());
            }
            else if (o instanceof Float) {
                final float floatValue = (float)o;
                if (b && floatValue == 0.0f) {
                    return;
                }
                this.j(g(agka) << 3 | 0x5);
                this.f.write(i(4).putFloat(floatValue).array());
            }
            else {
                if (o instanceof Number) {
                    this.d(agka, ((Number)o).longValue(), b);
                    return;
                }
                if (o instanceof Boolean) {
                    this.c(agka, ((boolean)o) ? 1 : 0, b);
                    return;
                }
                if (o instanceof byte[]) {
                    final byte[] array = (byte[])o;
                    if (b && array.length == 0) {
                        return;
                    }
                    this.j(g(agka) << 3 | 0x2);
                    this.j(array.length);
                    this.f.write(array);
                }
                else {
                    final agkb agkb = this.c.get(o.getClass());
                    if (agkb != null) {
                        this.l(agkb, agka, o, b);
                        return;
                    }
                    final agkd agkd = this.g.get(o.getClass());
                    if (agkd != null) {
                        agkd.a(o, (Object)this.i);
                        return;
                    }
                    if (o instanceof agkg) {
                        this.e(agka, ((agkg)o).a());
                        return;
                    }
                    if (o instanceof Enum) {
                        this.e(agka, ((Enum)o).ordinal());
                        return;
                    }
                    this.l(this.h, agka, o, b);
                }
            }
        }
    }
}
