import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrr extends ahbh implements ahcw
{
    public static final aqrr a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrr.class, (ahbh)(a = new aqrr()));
    }
    
    private aqrr() {
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
                if ((c = aqrr.c) == null) {
                    synchronized (aqrr.class) {
                        if (aqrr.c == null) {
                            aqrr.c = (ahdd)new ahba((ahbh)aqrr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrr.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrr.a);
            }
            case 3: {
                return new aqrr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
