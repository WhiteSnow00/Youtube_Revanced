import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjp extends ahbh implements ahcw
{
    public static final amjp a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ajut d;
    public ajut e;
    public aiqj f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amjp.class, (ahbh)(a = new amjp()));
    }
    
    private amjp() {
        this.h = 2;
        this.c = "";
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
                if ((g = amjp.g) == null) {
                    synchronized (amjp.class) {
                        if (amjp.g == null) {
                            amjp.g = (ahdd)new ahba((ahbh)amjp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amjp.a;
            }
            case 4: {
                return new ahaz((ahbh)amjp.a);
            }
            case 3: {
                return new amjp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
