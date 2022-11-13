import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alow extends ahbh implements ahcw
{
    public static final alow a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alow.class, (ahbh)(a = new alow()));
    }
    
    private alow() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alow.b) == null) {
                    synchronized (alow.class) {
                        if (alow.b == null) {
                            alow.b = (ahdd)new ahba((ahbh)alow.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alow.a;
            }
            case 4: {
                return new ahaz((ahbh)alow.a);
            }
            case 3: {
                return new alow();
            }
            case 2: {
                return newMessageInfo((MessageLite)alow.a, "\u0001\u0000", (Object[])null);
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
