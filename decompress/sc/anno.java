import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anno extends ahbh implements ahcw
{
    public static final anno a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anno.class, (ahbh)(a = new anno()));
    }
    
    private anno() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anno.b) == null) {
                    synchronized (anno.class) {
                        if (anno.b == null) {
                            anno.b = (ahdd)new ahba((ahbh)anno.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anno.a;
            }
            case 4: {
                return new ahaz((ahbh)anno.a);
            }
            case 3: {
                return new anno();
            }
            case 2: {
                return newMessageInfo((MessageLite)anno.a, "\u0000\u0000", (Object[])null);
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
