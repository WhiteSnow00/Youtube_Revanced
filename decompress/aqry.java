import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqry extends ahbh implements ahcw
{
    public static final aqry a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqry.class, (ahbh)(a = new aqry()));
    }
    
    private aqry() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqry.e) == null) {
                    synchronized (aqry.class) {
                        if (aqry.e == null) {
                            aqry.e = (ahdd)new ahba((ahbh)aqry.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqry.a;
            }
            case 4: {
                return new ahaz((ahbh)aqry.a);
            }
            case 3: {
                return new aqry();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqry.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
