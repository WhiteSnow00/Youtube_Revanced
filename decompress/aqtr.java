import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtr extends ahbh implements ahcw
{
    public static final aqtr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqtr.class, (ahbh)(a = new aqtr()));
    }
    
    private aqtr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqtr.b) == null) {
                    synchronized (aqtr.class) {
                        if (aqtr.b == null) {
                            aqtr.b = (ahdd)new ahba((ahbh)aqtr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqtr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqtr.a);
            }
            case 3: {
                return new aqtr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqtr.a, "\u0001\u0000", (Object[])null);
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
