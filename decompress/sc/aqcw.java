import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcw extends ahbh implements ahcw
{
    public static final aqcw a;
    private static volatile ahdd e;
    public int b;
    public aqsl c;
    public ahcr d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcw.class, (ahbh)(a = new aqcw()));
    }
    
    private aqcw() {
        this.d = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqcw.e) == null) {
                    synchronized (aqcw.class) {
                        if (aqcw.e == null) {
                            aqcw.e = (ahdd)new ahba((ahbh)aqcw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqcw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcw.a);
            }
            case 3: {
                return new aqcw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1009\u0000\u00022", new Object[] { "b", "c", "d", aqcv.a });
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
