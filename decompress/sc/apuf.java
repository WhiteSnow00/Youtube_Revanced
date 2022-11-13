import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuf extends ahbh implements ahcw
{
    public static final apuf a;
    private static volatile ahdd c;
    public int b;
    
    static {
        ahbh.registerDefaultInstance((Class)apuf.class, (ahbh)(a = new apuf()));
    }
    
    private apuf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = apuf.c) == null) {
                    synchronized (apuf.class) {
                        if (apuf.c == null) {
                            apuf.c = (ahdd)new ahba((ahbh)apuf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apuf.a;
            }
            case 4: {
                return new ahaz((ahbh)apuf.a);
            }
            case 3: {
                return new apuf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apuf.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[] { "b" });
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
