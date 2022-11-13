import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrn extends ahbh implements ahcw
{
    public static final aqrn a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrn.class, (ahbh)(a = new aqrn()));
    }
    
    private aqrn() {
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
                if ((c = aqrn.c) == null) {
                    synchronized (aqrn.class) {
                        if (aqrn.c == null) {
                            aqrn.c = (ahdd)new ahba((ahbh)aqrn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrn.a);
            }
            case 3: {
                return new aqrn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrn.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
