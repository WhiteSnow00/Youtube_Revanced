import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoia extends ahcz implements aheo
{
    private static final aoia a;
    private static volatile ahev b;
    private int c;
    private int d;
    private Object e;
    private String f;
    
    static {
        ahcz.registerDefaultInstance(aoia.class, a = new aoia());
    }
    
    private aoia() {
        this.d = 0;
        this.f = "";
    }
    
    public static aohz a() {
        return (aohz)aoia.a.createBuilder();
    }
    
    static aoia b() {
        return aoia.a;
    }
    
    public static void c(final aoia aoia, final aohy aohy) {
        aoia.h(aohy);
    }
    
    public static void d(final aoia aoia, final aohw aohw) {
        aoia.i(aohw);
    }
    
    public static void e(final aoia aoia, final aoht aoht) {
        aoia.g(aoht);
    }
    
    public static void f(final aoia aoia, final String s) {
        aoia.j(s);
    }
    
    private void g(final aoht e) {
        e.getClass();
        this.e = e;
        this.d = 3;
    }
    
    private void h(final aohy e) {
        e.getClass();
        this.e = e;
        this.d = 1;
    }
    
    private void i(final aohw e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void j(final String f) {
        f.getClass();
        this.c |= 0x8;
        this.f = f;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aoia.b) == null) {
                    synchronized (aoia.class) {
                        if (aoia.b == null) {
                            aoia.b = (ahev)new ahcs((ahcz)aoia.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoia.a;
            }
            case 4: {
                return new aohz();
            }
            case 3: {
                return new aoia();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoia.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1008\u0003", new Object[] { "e", "d", "c", aohy.class, aohw.class, aoht.class, "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
