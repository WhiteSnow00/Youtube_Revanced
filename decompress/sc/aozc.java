import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozc extends ahbh implements ahcw
{
    public static final aozc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aozc.class, (ahbh)(a = new aozc()));
    }
    
    private aozc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aozc.b) == null) {
                    synchronized (aozc.class) {
                        if (aozc.b == null) {
                            aozc.b = (ahdd)new ahba((ahbh)aozc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aozc.a;
            }
            case 4: {
                return new ahaz((ahbh)aozc.a);
            }
            case 3: {
                return new aozc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozc.a, "\u0001\u0000", (Object[])null);
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
