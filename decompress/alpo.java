import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpo extends ahcz implements aheo
{
    private static final alpo a;
    private static volatile ahev b;
    private int c;
    private int d;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(alpo.class, a = new alpo());
    }
    
    private alpo() {
    }
    
    public static alpn a() {
        return (alpn)alpo.a.createBuilder();
    }
    
    static alpo b() {
        return alpo.a;
    }
    
    public static void c(final alpo alpo, final alpp alpp) {
        alpo.f(alpp);
    }
    
    public static void d(final alpo alpo, final int n) {
        alpo.e(n);
    }
    
    private void e(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final alpp alpp) {
        this.d = alpp.j;
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
                if ((b = alpo.b) == null) {
                    synchronized (alpo.class) {
                        if (alpo.b == null) {
                            alpo.b = (ahev)new ahcs((ahcz)alpo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpo.a;
            }
            case 4: {
                return new alpn();
            }
            case 3: {
                return new alpo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "c", "d", alpp.a(), "e" });
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
