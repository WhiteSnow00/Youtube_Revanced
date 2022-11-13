import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptp extends ahbh implements ahcw
{
    public static final aptp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptp.class, (ahbh)(a = new aptp()));
    }
    
    private aptp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptp.b) == null) {
                    synchronized (aptp.class) {
                        if (aptp.b == null) {
                            aptp.b = (ahdd)new ahba((ahbh)aptp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptp.a;
            }
            case 4: {
                return new ahaz((ahbh)aptp.a);
            }
            case 3: {
                return new aptp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptp.a, "\u0001\u0000", (Object[])null);
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
