import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfm extends ahbh implements ahcw
{
    public static final anfm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anfm.class, (ahbh)(a = new anfm()));
    }
    
    private anfm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anfm.b) == null) {
                    synchronized (anfm.class) {
                        if (anfm.b == null) {
                            anfm.b = (ahdd)new ahba((ahbh)anfm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anfm.a;
            }
            case 4: {
                return new ahaz((ahbh)anfm.a);
            }
            case 3: {
                return new anfm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfm.a, "\u0001\u0000", (Object[])null);
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
