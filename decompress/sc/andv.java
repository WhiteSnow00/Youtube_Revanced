import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class andv extends ahbh implements ahcw
{
    public static final andv a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andv.class, (ahbh)(a = new andv()));
    }
    
    private andv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andv.b) == null) {
                    synchronized (andv.class) {
                        if (andv.b == null) {
                            andv.b = (ahdd)new ahba((ahbh)andv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andv.a;
            }
            case 4: {
                return new ahaz((ahbh)andv.a);
            }
            case 3: {
                return new andv();
            }
            case 2: {
                return newMessageInfo((MessageLite)andv.a, "\u0001\u0000", (Object[])null);
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