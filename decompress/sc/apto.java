import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apto extends ahbh implements ahcw
{
    public static final apto a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apto.class, (ahbh)(a = new apto()));
    }
    
    private apto() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apto.c) == null) {
                    synchronized (apto.class) {
                        if (apto.c == null) {
                            apto.c = (ahdd)new ahba((ahbh)apto.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apto.a;
            }
            case 4: {
                return new ahaz((ahbh)apto.a);
            }
            case 3: {
                return new apto();
            }
            case 2: {
                return newMessageInfo((MessageLite)apto.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
