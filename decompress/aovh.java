import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovh extends ahbh implements ahcw
{
    public static final aovh a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aovh.class, (ahbh)(a = new aovh()));
    }
    
    private aovh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aovh.c) == null) {
                    synchronized (aovh.class) {
                        if (aovh.c == null) {
                            aovh.c = (ahdd)new ahba((ahbh)aovh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aovh.a;
            }
            case 4: {
                return new ahaz((ahbh)aovh.a);
            }
            case 3: {
                return new aovh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aove.d });
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
