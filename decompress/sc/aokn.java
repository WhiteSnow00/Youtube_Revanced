import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokn extends ahbh implements ahcw
{
    public static final aokn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aokn.class, (ahbh)(a = new aokn()));
    }
    
    private aokn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aokn.b) == null) {
                    synchronized (aokn.class) {
                        if (aokn.b == null) {
                            aokn.b = (ahdd)new ahba((ahbh)aokn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokn.a;
            }
            case 4: {
                return new ahaz((ahbh)aokn.a);
            }
            case 3: {
                return new aokn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokn.a, "\u0001\u0000", (Object[])null);
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
