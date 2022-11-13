import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anoq extends ahbh implements ahcw
{
    public static final anoq a;
    private static volatile ahdd d;
    public int b;
    public long c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anoq.class, (ahbh)(a = new anoq()));
    }
    
    private anoq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anoq.d) == null) {
                    synchronized (anoq.class) {
                        if (anoq.d == null) {
                            anoq.d = (ahdd)new ahba((ahbh)anoq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anoq.a;
            }
            case 4: {
                return new ahaz((ahbh)anoq.a);
            }
            case 3: {
                return new anoq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anoq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "e", "b", anic.p, "c" });
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
