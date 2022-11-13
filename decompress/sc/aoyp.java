import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyp extends ahbh implements ahcw
{
    public static final aoyp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyp.class, (ahbh)(a = new aoyp()));
    }
    
    private aoyp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyp.b) == null) {
                    synchronized (aoyp.class) {
                        if (aoyp.b == null) {
                            aoyp.b = (ahdd)new ahba((ahbh)aoyp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyp.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyp.a);
            }
            case 3: {
                return new aoyp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyp.a, "\u0001\u0000", (Object[])null);
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
