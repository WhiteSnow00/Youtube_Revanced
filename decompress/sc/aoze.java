import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoze extends ahbh implements ahcw
{
    public static final aoze a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoze.class, (ahbh)(a = new aoze()));
    }
    
    private aoze() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aoze.c) == null) {
                    synchronized (aoze.class) {
                        if (aoze.c == null) {
                            aoze.c = (ahdd)new ahba((ahbh)aoze.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoze.a;
            }
            case 4: {
                return new ahaz((ahbh)aoze.a);
            }
            case 3: {
                return new aoze();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoze.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
