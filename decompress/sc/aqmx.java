import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmx extends ahbh implements ahcw
{
    public static final aqmx a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmx.class, (ahbh)(a = new aqmx()));
    }
    
    private aqmx() {
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
                if ((c = aqmx.c) == null) {
                    synchronized (aqmx.class) {
                        if (aqmx.c == null) {
                            aqmx.c = (ahdd)new ahba((ahbh)aqmx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqmx.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmx.a);
            }
            case 3: {
                return new aqmx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
