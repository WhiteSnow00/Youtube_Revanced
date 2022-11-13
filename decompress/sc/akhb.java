import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhb extends ahbh implements ahcw
{
    public static final akhb a;
    private static volatile ahdd c;
    public ajut b;
    private int d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akhb.class, (ahbh)(a = new akhb()));
    }
    
    private akhb() {
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
                final ahdd c;
                if ((c = akhb.c) == null) {
                    synchronized (akhb.class) {
                        if (akhb.c == null) {
                            akhb.c = (ahdd)new ahba((ahbh)akhb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akhb.a;
            }
            case 4: {
                return new ahaz((ahbh)akhb.a);
            }
            case 3: {
                return new akhb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
