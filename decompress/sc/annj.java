import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annj extends ahbh implements ahcw
{
    public static final annj a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)annj.class, (ahbh)(a = new annj()));
    }
    
    private annj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annj.b) == null) {
                    synchronized (annj.class) {
                        if (annj.b == null) {
                            annj.b = (ahdd)new ahba((ahbh)annj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annj.a;
            }
            case 4: {
                return new ahaz((ahbh)annj.a);
            }
            case 3: {
                return new annj();
            }
            case 2: {
                return newMessageInfo((MessageLite)annj.a, "\u0000\u0000", (Object[])null);
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
