import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apti extends ahbh implements ahcw
{
    public static final apti a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apti.class, (ahbh)(a = new apti()));
    }
    
    private apti() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apti.b) == null) {
                    synchronized (apti.class) {
                        if (apti.b == null) {
                            apti.b = (ahdd)new ahba((ahbh)apti.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apti.a;
            }
            case 4: {
                return new ahaz((ahbh)apti.a);
            }
            case 3: {
                return new apti();
            }
            case 2: {
                return newMessageInfo((MessageLite)apti.a, "\u0001\u0000", (Object[])null);
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
