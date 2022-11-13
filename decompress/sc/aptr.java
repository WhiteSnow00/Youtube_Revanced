import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptr extends ahbh implements ahcw
{
    public static final aptr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aptr.class, (ahbh)(a = new aptr()));
    }
    
    private aptr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aptr.b) == null) {
                    synchronized (aptr.class) {
                        if (aptr.b == null) {
                            aptr.b = (ahdd)new ahba((ahbh)aptr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptr.a;
            }
            case 4: {
                return new ahaz((ahbh)aptr.a);
            }
            case 3: {
                return new aptr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptr.a, "\u0001\u0000", (Object[])null);
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
