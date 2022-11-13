import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alon extends ahbh implements ahcw
{
    public static final alon a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)alon.class, (ahbh)(a = new alon()));
    }
    
    private alon() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = alon.b) == null) {
                    synchronized (alon.class) {
                        if (alon.b == null) {
                            alon.b = (ahdd)new ahba((ahbh)alon.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alon.a;
            }
            case 4: {
                return new ahaz((ahbh)alon.a);
            }
            case 3: {
                return new alon();
            }
            case 2: {
                return newMessageInfo((MessageLite)alon.a, "\u0001\u0000", (Object[])null);
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
