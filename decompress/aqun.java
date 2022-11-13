import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqun extends ahbh implements ahcw
{
    public static final aqun a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqun.class, (ahbh)(a = new aqun()));
    }
    
    private aqun() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqun.b) == null) {
                    synchronized (aqun.class) {
                        if (aqun.b == null) {
                            aqun.b = (ahdd)new ahba((ahbh)aqun.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqun.a;
            }
            case 4: {
                return new ahaz((ahbh)aqun.a);
            }
            case 3: {
                return new aqun();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqun.a, "\u0001\u0000", (Object[])null);
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
