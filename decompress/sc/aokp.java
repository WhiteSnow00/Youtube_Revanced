import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokp extends ahbh implements ahcw
{
    private static final aokp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aokp.class, (ahbh)(a = new aokp()));
    }
    
    private aokp() {
    }
    
    public static aokp a() {
        return aokp.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aokp.b) == null) {
                    synchronized (aokp.class) {
                        if (aokp.b == null) {
                            aokp.b = (ahdd)new ahba((ahbh)aokp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokp.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aokp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokp.a, "\u0001\u0000", (Object[])null);
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
