import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrq extends ahbh implements ahcw
{
    public static final aqrq a;
    private static volatile ahdd f;
    public int b;
    public aqsb c;
    public aqrx d;
    public aqsd e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrq.class, (ahbh)(a = new aqrq()));
    }
    
    private aqrq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrq.f) == null) {
                    synchronized (aqrq.class) {
                        if (aqrq.f == null) {
                            aqrq.f = (ahdd)new ahba((ahbh)aqrq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrq.a);
            }
            case 3: {
                return new aqrq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
