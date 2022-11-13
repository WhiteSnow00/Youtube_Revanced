import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghn extends ahbh implements ahcw
{
    private static final aghn a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aghn.class, (ahbh)(a = new aghn()));
    }
    
    private aghn() {
    }
    
    public static aghm a() {
        return (aghm)aghn.a.createBuilder();
    }
    
    static aghn b() {
        return aghn.a;
    }
    
    public static void c(final aghn aghn, final int n) {
        aghn.e(n);
    }
    
    public static void d(final aghn aghn, final aghl aghl) {
        aghn.f(aghl);
    }
    
    private void e(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final aghl aghl) {
        this.e = aghl.g;
        this.c |= 0x2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghn.b) == null) {
                    synchronized (aghn.class) {
                        if (aghn.b == null) {
                            aghn.b = (ahdd)new ahba((ahbh)aghn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghn.a;
            }
            case 4: {
                return new aghm();
            }
            case 3: {
                return new aghn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", aghl.b() });
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
