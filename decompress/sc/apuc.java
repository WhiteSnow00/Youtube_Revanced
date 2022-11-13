import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuc extends ahbh implements ahcw
{
    public static final apuc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apuc.class, (ahbh)(a = new apuc()));
    }
    
    private apuc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apuc.b) == null) {
                    synchronized (apuc.class) {
                        if (apuc.b == null) {
                            apuc.b = (ahdd)new ahba((ahbh)apuc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apuc.a;
            }
            case 4: {
                return new ahaz((ahbh)apuc.a);
            }
            case 3: {
                return new apuc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apuc.a, "\u0001\u0000", (Object[])null);
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
