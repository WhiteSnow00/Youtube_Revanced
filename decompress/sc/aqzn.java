import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzn extends ahbh implements ahcw
{
    private static final aqzn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzn.class, (ahbh)(a = new aqzn()));
    }
    
    private aqzn() {
    }
    
    public static aqzn a() {
        return aqzn.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzn.b) == null) {
                    synchronized (aqzn.class) {
                        if (aqzn.b == null) {
                            aqzn.b = (ahdd)new ahba((ahbh)aqzn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzn.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqzn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzn.a, "\u0001\u0000", (Object[])null);
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
