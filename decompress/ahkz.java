import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkz extends ahcz implements aheo
{
    private static final ahkz a;
    private static volatile ahev b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(ahkz.class, a = new ahkz());
    }
    
    private ahkz() {
    }
    
    public static ahky a() {
        return (ahky)ahkz.a.createBuilder();
    }
    
    static ahkz b() {
        return ahkz.a;
    }
    
    public static void c(final ahkz ahkz, final ahkx ahkx) {
        ahkz.h(ahkx);
    }
    
    public static void d(final ahkz ahkz, final ahkv ahkv) {
        ahkz.f(ahkv);
    }
    
    public static void e(final ahkz ahkz, final ahkw ahkw) {
        ahkz.g(ahkw);
    }
    
    private void f(final ahkv ahkv) {
        this.e = ahkv.d;
        this.c |= 0x2;
    }
    
    private void g(final ahkw ahkw) {
        this.f = ahkw.d;
        this.c |= 0x4;
    }
    
    private void h(final ahkx ahkx) {
        this.d = ahkx.c;
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
                if ((b = ahkz.b) == null) {
                    synchronized (ahkz.class) {
                        if (ahkz.b == null) {
                            ahkz.b = (ahev)new ahcs((ahcz)ahkz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahkz.a;
            }
            case 4: {
                return new ahky();
            }
            case 3: {
                return new ahkz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahkz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "c", "d", ahkx.a(), "e", ahkv.a(), "f", ahkw.a() });
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
