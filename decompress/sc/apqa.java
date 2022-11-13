import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqa extends ahbh implements ahcw
{
    public static final apqa a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apqa.class, (ahbh)(a = new apqa()));
    }
    
    private apqa() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apqa.b) == null) {
                    synchronized (apqa.class) {
                        if (apqa.b == null) {
                            apqa.b = (ahdd)new ahba((ahbh)apqa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqa.a;
            }
            case 4: {
                return new ahaz((ahbh)apqa.a);
            }
            case 3: {
                return new apqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqa.a, "\u0001\u0000", (Object[])null);
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
