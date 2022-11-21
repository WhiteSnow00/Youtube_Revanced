import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alij extends ahcz implements aheo
{
    public static final alij a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    
    static {
        ahcz.registerDefaultInstance(alij.class, a = new alij());
    }
    
    private alij() {
    }
    
    public static void a(final alij alij) {
        alij.c |= 0x1;
        alij.d = true;
    }
    
    public static void b(final alij alij) {
        alij.c |= 0x2;
        alij.e = true;
    }
    
    public static void c(final alij alij) {
        alij.c |= 0x4;
        alij.f = true;
    }
    
    public static void d(final alij alij) {
        alij.c |= 0x8;
        alij.g = true;
    }
    
    public static void e(final alij alij) {
        alij.c |= 0x10;
        alij.h = true;
    }
    
    public static void f(final alij alij) {
        alij.c |= 0x20;
        alij.i = true;
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
                if ((b = alij.b) == null) {
                    synchronized (alij.class) {
                        if (alij.b == null) {
                            alij.b = (ahev)new ahcs((ahcz)alij.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alij.a;
            }
            case 4: {
                return new ahcr((ahcz)alij.a);
            }
            case 3: {
                return new alij();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alij.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
