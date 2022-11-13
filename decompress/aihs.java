import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihs extends ahbh implements ahcw
{
    public static final aihs a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aihs.class, (ahbh)(a = new aihs()));
    }
    
    private aihs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aihs.c) == null) {
                    synchronized (aihs.class) {
                        if (aihs.c == null) {
                            aihs.c = (ahdd)new ahba((ahbh)aihs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aihs.a;
            }
            case 4: {
                return new ahaz((ahbh)aihs.a);
            }
            case 3: {
                return new aihs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aieh.k });
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
