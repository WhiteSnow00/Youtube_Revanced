import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifi extends ahbh implements ahcw
{
    public static final aifi a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aifi.class, (ahbh)(a = new aifi()));
    }
    
    private aifi() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aifi.b) == null) {
                    synchronized (aifi.class) {
                        if (aifi.b == null) {
                            aifi.b = (ahdd)new ahba((ahbh)aifi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifi.a;
            }
            case 4: {
                return new ahaz((ahbh)aifi.a);
            }
            case 3: {
                return new aifi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifi.a, "\u0001\u0000", (Object[])null);
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
