import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqem extends ahbh implements ahcw
{
    public static final aqem a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqem.class, (ahbh)(a = new aqem()));
    }
    
    private aqem() {
        this.b = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqem.c) == null) {
                    synchronized (aqem.class) {
                        if (aqem.c == null) {
                            aqem.c = (ahdd)new ahba((ahbh)aqem.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqem.a;
            }
            case 4: {
                return new ahaz((ahbh)aqem.a);
            }
            case 3: {
                return new aqem();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqem.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
