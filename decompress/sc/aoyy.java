import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyy extends ahbh implements ahcw
{
    private static final aoyy a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyy.class, (ahbh)(a = new aoyy()));
    }
    
    private aoyy() {
    }
    
    public static aoyy a() {
        return aoyy.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyy.b) == null) {
                    synchronized (aoyy.class) {
                        if (aoyy.b == null) {
                            aoyy.b = (ahdd)new ahba((ahbh)aoyy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyy.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aoyy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyy.a, "\u0001\u0000", (Object[])null);
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
