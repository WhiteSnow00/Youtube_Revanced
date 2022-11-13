import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptm extends ahbh implements ahcw
{
    public static final aptm a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptm.class, (ahbh)(a = new aptm()));
    }
    
    private aptm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptm.b) == null) {
                    synchronized (aptm.class) {
                        if (aptm.b == null) {
                            aptm.b = (ahdd)new ahba((ahbh)aptm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptm.a;
            }
            case 4: {
                return new ahaz((ahbh)aptm.a);
            }
            case 3: {
                return new aptm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptm.a, "\u0001\u0000", (Object[])null);
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
