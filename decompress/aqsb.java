import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsb extends ahbh implements ahcw
{
    public static final aqsb a;
    private static volatile ahdd c;
    public ahab b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsb.class, (ahbh)(a = new aqsb()));
    }
    
    private aqsb() {
        this.b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqsb.c) == null) {
                    synchronized (aqsb.class) {
                        if (aqsb.c == null) {
                            aqsb.c = (ahdd)new ahba((ahbh)aqsb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqsb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsb.a);
            }
            case 3: {
                return new aqsb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsb.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[] { "b" });
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
