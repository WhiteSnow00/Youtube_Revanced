import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoza extends ahbh implements ahcw
{
    public static final aoza a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoza.class, (ahbh)(a = new aoza()));
    }
    
    private aoza() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoza.b) == null) {
                    synchronized (aoza.class) {
                        if (aoza.b == null) {
                            aoza.b = (ahdd)new ahba((ahbh)aoza.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoza.a;
            }
            case 4: {
                return new ahaz((ahbh)aoza.a);
            }
            case 3: {
                return new aoza();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoza.a, "\u0001\u0000", (Object[])null);
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
