import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloy extends ahbh implements ahcw
{
    private static final aloy a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aloy.class, (ahbh)(a = new aloy()));
    }
    
    private aloy() {
    }
    
    public static aloy a() {
        return aloy.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aloy.b) == null) {
                    synchronized (aloy.class) {
                        if (aloy.b == null) {
                            aloy.b = (ahdd)new ahba((ahbh)aloy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aloy.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aloy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aloy.a, "\u0001\u0000", (Object[])null);
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