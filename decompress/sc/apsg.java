import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsg extends ahbh implements ahcw
{
    public static final apsg a;
    private static volatile ahdd b;
    private int c;
    private apsf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)apsg.class, (ahbh)(a = new apsg()));
    }
    
    private apsg() {
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
                if ((b = apsg.b) == null) {
                    synchronized (apsg.class) {
                        if (apsg.b == null) {
                            apsg.b = (ahdd)new ahba((ahbh)apsg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsg.a;
            }
            case 4: {
                return new ahaz((ahbh)apsg.a);
            }
            case 3: {
                return new apsg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsg.a, "\u0001\u0001\u0000\u0001\uf9ad\u4129\uf9ad\u4129\u0001\u0000\u0000\u0001\uf9ad\u4129\u1409\u0000", new Object[] { "c", "d" });
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
