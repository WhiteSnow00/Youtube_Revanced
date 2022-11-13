import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrd extends ahbh implements ahcw
{
    public static final aqrd a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public ahcr d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrd.class, (ahbh)(a = new aqrd()));
    }
    
    private aqrd() {
        this.d = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrd.f) == null) {
                    synchronized (aqrd.class) {
                        if (aqrd.f == null) {
                            aqrd.f = (ahdd)new ahba((ahbh)aqrd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrd.a;
            }
            case 4: {
                return new ahaz((short[][][])null, (boolean[])null);
            }
            case 3: {
                return new aqrd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u100c\u0000\u00022\u0003\u1002\u0001", new Object[] { "b", "c", aqra.a(), "d", aqrc.a, "e" });
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
