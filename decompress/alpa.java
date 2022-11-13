import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpa extends ahbh implements ahcw
{
    private static final alpa a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)alpa.class, (ahbh)(a = new alpa()));
    }
    
    private alpa() {
    }
    
    public static aloz a() {
        return (aloz)alpa.a.createBuilder();
    }
    
    static alpa b() {
        return alpa.a;
    }
    
    public static void c(final alpa alpa, final alpc alpc) {
        alpa.f(alpc);
    }
    
    public static void d(final alpa alpa, final alpb alpb) {
        alpa.e(alpb);
    }
    
    private void e(final alpb alpb) {
        this.e = alpb.e;
        this.c |= 0x2;
    }
    
    private void f(final alpc alpc) {
        this.d = alpc.g;
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
                if ((b = alpa.b) == null) {
                    synchronized (alpa.class) {
                        if (alpa.b == null) {
                            alpa.b = (ahdd)new ahba((ahbh)alpa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpa.a;
            }
            case 4: {
                return new aloz();
            }
            case 3: {
                return new alpa();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "c", "d", alpc.a(), "e", alpb.a() });
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
