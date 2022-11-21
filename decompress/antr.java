import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antr extends ahcz implements aheo
{
    private static final antr a;
    private static volatile ahev b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(antr.class, a = new antr());
    }
    
    private antr() {
    }
    
    public static antq a() {
        return (antq)antr.a.createBuilder();
    }
    
    static antr b() {
        return antr.a;
    }
    
    public static void c(final antr antr, final ants ants) {
        antr.f(ants);
    }
    
    public static void d(final antr antr, final ajfx ajfx) {
        antr.g(ajfx);
    }
    
    public static void e(final antr antr, final antt antt) {
        antr.h(antt);
    }
    
    private void f(final ants ants) {
        this.d = ants.e;
        this.c |= 0x1;
    }
    
    private void g(final ajfx ajfx) {
        this.e = ajfx.B;
        this.c |= 0x2;
    }
    
    private void h(final antt antt) {
        this.f = antt.f;
        this.c |= 0x8;
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
                if ((b = antr.b) == null) {
                    synchronized (antr.class) {
                        if (antr.b == null) {
                            antr.b = (ahev)new ahcs((ahcz)antr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antr.a;
            }
            case 4: {
                return new antq();
            }
            case 3: {
                return new antr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antr.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u100c\u0003", new Object[] { "c", "d", ants.a(), "e", ajfx.a(), "f", antt.a() });
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
