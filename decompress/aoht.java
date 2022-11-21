import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoht extends ahcz implements aheo
{
    private static final aoht a;
    private static volatile ahev b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    static {
        ahcz.registerDefaultInstance(aoht.class, a = new aoht());
    }
    
    private aoht() {
    }
    
    public static aohs a() {
        return (aohs)aoht.a.createBuilder();
    }
    
    static aoht b() {
        return aoht.a;
    }
    
    public static void c(final aoht aoht, final aohr aohr) {
        aoht.j(aohr);
    }
    
    public static void d(final aoht aoht, final boolean b) {
        aoht.g(b);
    }
    
    public static void e(final aoht aoht, final boolean b) {
        aoht.h(b);
    }
    
    public static void f(final aoht aoht, final boolean b) {
        aoht.i(b);
    }
    
    private void g(final boolean e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void h(final boolean f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void j(final aohr aohr) {
        this.d = aohr.d;
        this.c |= 0x1;
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
                if ((b = aoht.b) == null) {
                    synchronized (aoht.class) {
                        if (aoht.b == null) {
                            aoht.b = (ahev)new ahcs((ahcz)aoht.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoht.a;
            }
            case 4: {
                return new aohs();
            }
            case 3: {
                return new aoht();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoht.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "c", "d", aohr.a(), "e", "f", "g" });
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
