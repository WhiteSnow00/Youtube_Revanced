import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aien extends ahcz implements aheo
{
    private static final aien a;
    private static volatile ahev b;
    private int c;
    private String d;
    private int e;
    private String f;
    private boolean g;
    
    static {
        ahcz.registerDefaultInstance(aien.class, a = new aien());
    }
    
    private aien() {
        this.d = "";
        this.f = "";
    }
    
    public static aiem a() {
        return (aiem)aien.a.createBuilder();
    }
    
    static aien b() {
        return aien.a;
    }
    
    public static void c(final aien aien, final String s) {
        aien.i(s);
    }
    
    public static void d(final aien aien, final int n) {
        aien.j(n);
    }
    
    public static void e(final aien aien, final String s) {
        aien.h(s);
    }
    
    public static void f(final aien aien, final boolean b) {
        aien.g(b);
    }
    
    private void g(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void h(final String f) {
        f.getClass();
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void j(final int e) {
        this.c |= 0x2;
        this.e = e;
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
                if ((b = aien.b) == null) {
                    synchronized (aien.class) {
                        if (aien.b == null) {
                            aien.b = (ahev)new ahcs((ahcz)aien.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aien.a;
            }
            case 4: {
                return new aiem();
            }
            case 3: {
                return new aien();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aien.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
