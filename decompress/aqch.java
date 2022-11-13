import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqch extends ahbh implements ahcw
{
    public static final aqch a;
    private static volatile ahdd c;
    public ahan b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqch.class, (ahbh)(a = new aqch()));
    }
    
    private aqch() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqch.c) == null) {
                    synchronized (aqch.class) {
                        if (aqch.c == null) {
                            aqch.c = (ahdd)new ahba((ahbh)aqch.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqch.a;
            }
            case 4: {
                return new ahaz((ahbh)aqch.a);
            }
            case 3: {
                return new aqch();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqch.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
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
