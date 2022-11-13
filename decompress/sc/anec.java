import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anec extends ahbh implements ahcw
{
    public static final anec a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ajut d;
    public String e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anec.class, (ahbh)(a = new anec()));
    }
    
    private anec() {
        this.h = 2;
        this.c = "";
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anec.g) == null) {
                    synchronized (anec.class) {
                        if (anec.g == null) {
                            anec.g = (ahdd)new ahba((ahbh)anec.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anec.a;
            }
            case 4: {
                return new ahaz((ahbh)anec.a);
            }
            case 3: {
                return new anec();
            }
            case 2: {
                return newMessageInfo((MessageLite)anec.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1008\u0003\u0002\u1409\u0004\u0003\u1008\u0005\u0004\u1008\u0006", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
