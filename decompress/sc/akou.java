import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akou extends ahbh implements ahcw
{
    public static final akou a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)akou.class, (ahbh)(a = new akou()));
    }
    
    private akou() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akou.c) == null) {
                    synchronized (akou.class) {
                        if (akou.c == null) {
                            akou.c = (ahdd)new ahba((ahbh)akou.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akou.a;
            }
            case 4: {
                return new ahaz((ahbh)akou.a);
            }
            case 3: {
                return new akou();
            }
            case 2: {
                return newMessageInfo((MessageLite)akou.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u100c\u0002", new Object[] { "d", "b", amvu.h });
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
