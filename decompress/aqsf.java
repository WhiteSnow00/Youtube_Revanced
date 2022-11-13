import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsf extends ahbh implements ahcw
{
    public static final aqsf a;
    private static volatile ahdd c;
    public long b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsf.class, (ahbh)(a = new aqsf()));
    }
    
    private aqsf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqsf.c) == null) {
                    synchronized (aqsf.class) {
                        if (aqsf.c == null) {
                            aqsf.c = (ahdd)new ahba((ahbh)aqsf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqsf.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsf.a);
            }
            case 3: {
                return new aqsf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "d", "b" });
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
