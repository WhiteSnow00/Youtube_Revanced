import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihr extends ahbh implements ahcw
{
    public static final aihr a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aihr.class, (ahbh)(a = new aihr()));
    }
    
    private aihr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aihr.c) == null) {
                    synchronized (aihr.class) {
                        if (aihr.c == null) {
                            aihr.c = (ahdd)new ahba((ahbh)aihr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aihr.a;
            }
            case 4: {
                return new ahaz((ahbh)aihr.a);
            }
            case 3: {
                return new aihr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aieh.j });
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
