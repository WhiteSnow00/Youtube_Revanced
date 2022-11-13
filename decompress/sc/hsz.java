import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsz extends ahbh implements ahcw
{
    public static final hsz a;
    private static volatile ahdd c;
    public boolean b;
    
    static {
        ahbh.registerDefaultInstance((Class)hsz.class, (ahbh)(a = new hsz()));
    }
    
    private hsz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = hsz.c) == null) {
                    synchronized (hsz.class) {
                        if (hsz.c == null) {
                            hsz.c = (ahdd)new ahba((ahbh)hsz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return hsz.a;
            }
            case 4: {
                return new ahaz((ahbh)hsz.a);
            }
            case 3: {
                return new hsz();
            }
            case 2: {
                return newMessageInfo((MessageLite)hsz.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[] { "b" });
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
