import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class andt extends ahbh implements ahcw
{
    public static final andt a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andt.class, (ahbh)(a = new andt()));
    }
    
    private andt() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andt.b) == null) {
                    synchronized (andt.class) {
                        if (andt.b == null) {
                            andt.b = (ahdd)new ahba((ahbh)andt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andt.a;
            }
            case 4: {
                return new ahaz((ahbh)andt.a);
            }
            case 3: {
                return new andt();
            }
            case 2: {
                return newMessageInfo((MessageLite)andt.a, "\u0001\u0000", (Object[])null);
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
