import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojp extends ahbh implements ahcw
{
    public static final aojp a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private anuv e;
    private anuv f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojp.class, (ahbh)(a = new aojp()));
    }
    
    private aojp() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aojp.b) == null) {
                    synchronized (aojp.class) {
                        if (aojp.b == null) {
                            aojp.b = (ahdd)new ahba((ahbh)aojp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojp.a;
            }
            case 4: {
                return new ahaz((ahbh)aojp.a);
            }
            case 3: {
                return new aojp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
