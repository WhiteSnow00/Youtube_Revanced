import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohp extends ahbh implements ahcw
{
    public static final aohp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aohp.class, (ahbh)(a = new aohp()));
    }
    
    private aohp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aohp.b) == null) {
                    synchronized (aohp.class) {
                        if (aohp.b == null) {
                            aohp.b = (ahdd)new ahba((ahbh)aohp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohp.a;
            }
            case 4: {
                return new ahaz((ahbh)aohp.a);
            }
            case 3: {
                return new aohp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohp.a, "\u0001\u0000", (Object[])null);
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
