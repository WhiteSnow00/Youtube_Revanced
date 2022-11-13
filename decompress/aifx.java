import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifx extends ahbh implements ahcw
{
    public static final aifx a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifx.class, (ahbh)(a = new aifx()));
    }
    
    private aifx() {
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
                if ((b = aifx.b) == null) {
                    synchronized (aifx.class) {
                        if (aifx.b == null) {
                            aifx.b = (ahdd)new ahba((ahbh)aifx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifx.a;
            }
            case 4: {
                return new ahaz((ahbh)aifx.a);
            }
            case 3: {
                return new aifx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
