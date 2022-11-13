import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajer extends ahbh implements ahcw
{
    public static final ajer a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)ajer.class, (ahbh)(a = new ajer()));
    }
    
    private ajer() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajer.b) == null) {
                    synchronized (ajer.class) {
                        if (ajer.b == null) {
                            ajer.b = (ahdd)new ahba((ahbh)ajer.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajer.a;
            }
            case 4: {
                return new ahaz((ahbh)ajer.a);
            }
            case 3: {
                return new ajer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajer.a, "\u0001\u0000", (Object[])null);
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
