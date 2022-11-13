import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alou extends ahbh implements ahcw
{
    public static final alou a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alou.class, (ahbh)(a = new alou()));
    }
    
    private alou() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alou.b) == null) {
                    synchronized (alou.class) {
                        if (alou.b == null) {
                            alou.b = (ahdd)new ahba((ahbh)alou.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alou.a;
            }
            case 4: {
                return new ahaz((ahbh)alou.a);
            }
            case 3: {
                return new alou();
            }
            case 2: {
                return newMessageInfo((MessageLite)alou.a, "\u0001\u0000", (Object[])null);
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
