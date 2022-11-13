import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcb extends ahbh implements ahcw
{
    public static final aqcb a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcb.class, (ahbh)(a = new aqcb()));
    }
    
    private aqcb() {
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
                if ((c = aqcb.c) == null) {
                    synchronized (aqcb.class) {
                        if (aqcb.c == null) {
                            aqcb.c = (ahdd)new ahba((ahbh)aqcb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqcb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcb.a);
            }
            case 3: {
                return new aqcb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcb.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
