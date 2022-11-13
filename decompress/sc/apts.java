import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apts extends ahbh implements ahcw
{
    public static final apts a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apts.class, (ahbh)(a = new apts()));
    }
    
    private apts() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apts.b) == null) {
                    synchronized (apts.class) {
                        if (apts.b == null) {
                            apts.b = (ahdd)new ahba((ahbh)apts.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apts.a;
            }
            case 4: {
                return new ahaz((ahbh)apts.a);
            }
            case 3: {
                return new apts();
            }
            case 2: {
                return newMessageInfo((MessageLite)apts.a, "\u0001\u0000", (Object[])null);
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
