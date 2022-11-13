import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammb extends ahbh implements ahcw
{
    public static final ammb a;
    private static volatile ahdd b;
    private int c;
    private ammc d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ammb.class, (ahbh)(a = new ammb()));
    }
    
    private ammb() {
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
                if ((b = ammb.b) == null) {
                    synchronized (ammb.class) {
                        if (ammb.b == null) {
                            ammb.b = (ahdd)new ahba((ahbh)ammb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ammb.a;
            }
            case 4: {
                return new ahaz((ahbh)ammb.a);
            }
            case 3: {
                return new ammb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ammb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
