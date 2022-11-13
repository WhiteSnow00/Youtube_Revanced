import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogp extends ahbh implements ahcw
{
    public static final aogp a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogp.class, (ahbh)(a = new aogp()));
    }
    
    private aogp() {
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
                final ahdd c;
                if ((c = aogp.c) == null) {
                    synchronized (aogp.class) {
                        if (aogp.c == null) {
                            aogp.c = (ahdd)new ahba((ahbh)aogp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aogp.a;
            }
            case 4: {
                return new ahaz((ahbh)aogp.a);
            }
            case 3: {
                return new aogp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
