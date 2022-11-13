import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrb extends ahbh implements ahcw
{
    public static final aqrb a;
    private static volatile ahdd f;
    public int b;
    public long c;
    public boolean d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrb.class, (ahbh)(a = new aqrb()));
    }
    
    private aqrb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrb.f) == null) {
                    synchronized (aqrb.class) {
                        if (aqrb.f == null) {
                            aqrb.f = (ahdd)new ahba((ahbh)aqrb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrb.a);
            }
            case 3: {
                return new aqrb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
