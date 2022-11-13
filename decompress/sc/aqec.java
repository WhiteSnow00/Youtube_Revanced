import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqec extends ahbh implements ahcw
{
    public static final aqec a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqec.class, (ahbh)(a = new aqec()));
    }
    
    private aqec() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqec.b) == null) {
                    synchronized (aqec.class) {
                        if (aqec.b == null) {
                            aqec.b = (ahdd)new ahba((ahbh)aqec.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqec.a;
            }
            case 4: {
                return new ahaz((ahbh)aqec.a);
            }
            case 3: {
                return new aqec();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqec.a, "\u0001\u0000", (Object[])null);
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
