import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbx extends ahbh implements ahcw
{
    public static final aqbx a;
    private static volatile ahdd c;
    public float b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqbx.class, (ahbh)(a = new aqbx()));
    }
    
    private aqbx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqbx.c) == null) {
                    synchronized (aqbx.class) {
                        if (aqbx.c == null) {
                            aqbx.c = (ahdd)new ahba((ahbh)aqbx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqbx.a;
            }
            case 4: {
                return new ahaz((ahbh)aqbx.a);
            }
            case 3: {
                return new aqbx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqbx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "d", "b" });
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
