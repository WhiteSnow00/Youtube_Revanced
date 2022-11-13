import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojz extends ahbh implements ahcw
{
    public static final aojz a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private aiqj e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aojz.class, (ahbh)(a = new aojz()));
    }
    
    private aojz() {
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
                if ((b = aojz.b) == null) {
                    synchronized (aojz.class) {
                        if (aojz.b == null) {
                            aojz.b = (ahdd)new ahba((ahbh)aojz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojz.a;
            }
            case 4: {
                return new ahaz((ahbh)aojz.a);
            }
            case 3: {
                return new aojz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojz.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
