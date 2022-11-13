import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appu extends ahbh implements ahcw
{
    private static final appu a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)appu.class, (ahbh)(a = new appu()));
    }
    
    private appu() {
    }
    
    public static appu a() {
        return appu.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = appu.b) == null) {
                    synchronized (appu.class) {
                        if (appu.b == null) {
                            appu.b = (ahdd)new ahba((ahbh)appu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appu.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new appu();
            }
            case 2: {
                return newMessageInfo((MessageLite)appu.a, "\u0001\u0000", (Object[])null);
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
