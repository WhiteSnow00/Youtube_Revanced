import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknj extends ahbh implements ahcw
{
    public static final aknj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aknj.class, (ahbh)(a = new aknj()));
    }
    
    private aknj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aknj.b) == null) {
                    synchronized (aknj.class) {
                        if (aknj.b == null) {
                            aknj.b = (ahdd)new ahba((ahbh)aknj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aknj.a;
            }
            case 4: {
                return new ahaz((ahbh)aknj.a);
            }
            case 3: {
                return new aknj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aknj.a, "\u0001\u0000", (Object[])null);
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
