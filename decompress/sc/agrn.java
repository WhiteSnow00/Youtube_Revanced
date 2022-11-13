import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrn extends ahbh implements ahcw
{
    public static final agrn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agrn.class, (ahbh)(a = new agrn()));
    }
    
    private agrn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agrn.b) == null) {
                    synchronized (agrn.class) {
                        if (agrn.b == null) {
                            agrn.b = (ahdd)new ahba((ahbh)agrn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agrn.a;
            }
            case 4: {
                return new ahaz((ahbh)agrn.a);
            }
            case 3: {
                return new agrn();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrn.a, "\u0001\u0000", (Object[])null);
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
