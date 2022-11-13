import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjl extends ahbh implements ahcw
{
    public static final amjl a;
    private static volatile ahdd d;
    public int b;
    public aiqj c;
    private aidg e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)amjl.class, (ahbh)(a = new amjl()));
    }
    
    private amjl() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amjl.d) == null) {
                    synchronized (amjl.class) {
                        if (amjl.d == null) {
                            amjl.d = (ahdd)new ahba((ahbh)amjl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjl.a;
            }
            case 4: {
                return new ahaz((ahbh)amjl.a);
            }
            case 3: {
                return new amjl();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
