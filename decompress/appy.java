import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appy extends ahbh implements ahcw
{
    public static final appy a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)appy.class, (ahbh)(a = new appy()));
    }
    
    private appy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appy.b) == null) {
                    synchronized (appy.class) {
                        if (appy.b == null) {
                            appy.b = (ahdd)new ahba((ahbh)appy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appy.a;
            }
            case 4: {
                return new ahaz((ahbh)appy.a);
            }
            case 3: {
                return new appy();
            }
            case 2: {
                return newMessageInfo((MessageLite)appy.a, "\u0001\u0000", (Object[])null);
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
