import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxp extends ahbh implements ahcw
{
    public static final aoxp a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxp.class, (ahbh)(a = new aoxp()));
    }
    
    private aoxp() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoxp.b) == null) {
                    synchronized (aoxp.class) {
                        if (aoxp.b == null) {
                            aoxp.b = (ahdd)new ahba((ahbh)aoxp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxp.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxp.a);
            }
            case 3: {
                return new aoxp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
