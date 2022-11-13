import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiib extends ahbh implements ahcw
{
    public static final aiib a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aiib.class, (ahbh)(a = new aiib()));
    }
    
    private aiib() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aiib.c) == null) {
                    synchronized (aiib.class) {
                        if (aiib.c == null) {
                            aiib.c = (ahdd)new ahba((ahbh)aiib.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiib.a;
            }
            case 4: {
                return new ahaz((ahbh)aiib.a);
            }
            case 3: {
                return new aiib();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiib.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aieh.m });
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
