import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aole extends ahbh implements ahcw
{
    public static final aole a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aole.class, (ahbh)(a = new aole()));
    }
    
    private aole() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aole.b) == null) {
                    synchronized (aole.class) {
                        if (aole.b == null) {
                            aole.b = (ahdd)new ahba((ahbh)aole.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aole.a;
            }
            case 4: {
                return new ahaz((ahbh)aole.a);
            }
            case 3: {
                return new aole();
            }
            case 2: {
                return newMessageInfo((MessageLite)aole.a, "\u0001\u0000", (Object[])null);
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
