import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anez extends ahbh implements ahcw
{
    private static final anez a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private String e;
    private long f;
    
    static {
        ahbh.registerDefaultInstance((Class)anez.class, (ahbh)(a = new anez()));
    }
    
    private anez() {
        this.e = "";
    }
    
    public static aney a() {
        return (aney)anez.a.createBuilder();
    }
    
    static anez b() {
        return anez.a;
    }
    
    public static void c(final anez anez, final anfa anfa) {
        anez.f(anfa);
    }
    
    public static void d(final anez anez, final long n) {
        anez.e(n);
    }
    
    private void e(final long f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void f(final anfa anfa) {
        this.d = anfa.l;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anez.b) == null) {
                    synchronized (anez.class) {
                        if (anez.b == null) {
                            anez.b = (ahdd)new ahba((ahbh)anez.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anez.a;
            }
            case 4: {
                return new aney();
            }
            case 3: {
                return new anez();
            }
            case 2: {
                return newMessageInfo((MessageLite)anez.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1002\u0002", new Object[] { "c", "d", anfa.a(), "f" });
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
