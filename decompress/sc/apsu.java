import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsu extends ahbh implements ahcw
{
    public static final apsu a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apsu.class, (ahbh)(a = new apsu()));
    }
    
    private apsu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apsu.b) == null) {
                    synchronized (apsu.class) {
                        if (apsu.b == null) {
                            apsu.b = (ahdd)new ahba((ahbh)apsu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsu.a;
            }
            case 4: {
                return new ahaz((ahbh)apsu.a);
            }
            case 3: {
                return new apsu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsu.a, "\u0001\u0000", (Object[])null);
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
