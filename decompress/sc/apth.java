import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apth extends ahbh implements ahcw
{
    public static final apth a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apth.class, (ahbh)(a = new apth()));
    }
    
    private apth() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apth.b) == null) {
                    synchronized (apth.class) {
                        if (apth.b == null) {
                            apth.b = (ahdd)new ahba((ahbh)apth.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apth.a;
            }
            case 4: {
                return new ahaz((ahbh)apth.a);
            }
            case 3: {
                return new apth();
            }
            case 2: {
                return newMessageInfo((MessageLite)apth.a, "\u0001\u0000", (Object[])null);
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
