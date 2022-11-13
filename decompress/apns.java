import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apns extends ahbh implements ahcw
{
    public static final apns a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)apns.class, (ahbh)(a = new apns()));
    }
    
    private apns() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = apns.e) == null) {
                    synchronized (apns.class) {
                        if (apns.e == null) {
                            apns.e = (ahdd)new ahba((ahbh)apns.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apns.a;
            }
            case 4: {
                return new ahaz((ahbh)apns.a);
            }
            case 3: {
                return new apns();
            }
            case 2: {
                return newMessageInfo((MessageLite)apns.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
