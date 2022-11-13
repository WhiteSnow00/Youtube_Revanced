import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alor extends ahbh implements ahcw
{
    public static final alor a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alor.class, (ahbh)(a = new alor()));
    }
    
    private alor() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alor.b) == null) {
                    synchronized (alor.class) {
                        if (alor.b == null) {
                            alor.b = (ahdd)new ahba((ahbh)alor.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alor.a;
            }
            case 4: {
                return new ahaz((ahbh)alor.a);
            }
            case 3: {
                return new alor();
            }
            case 2: {
                return newMessageInfo((MessageLite)alor.a, "\u0001\u0000", (Object[])null);
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
