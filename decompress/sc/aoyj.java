import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyj extends ahbh implements ahcw
{
    public static final aoyj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyj.class, (ahbh)(a = new aoyj()));
    }
    
    private aoyj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyj.b) == null) {
                    synchronized (aoyj.class) {
                        if (aoyj.b == null) {
                            aoyj.b = (ahdd)new ahba((ahbh)aoyj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyj.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyj.a);
            }
            case 3: {
                return new aoyj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyj.a, "\u0001\u0000", (Object[])null);
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
