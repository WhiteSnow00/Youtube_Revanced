import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqez extends ahbh implements ahcw
{
    public static final aqez a;
    private static volatile ahdd d;
    public int b;
    public aqhf c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqez.class, (ahbh)(a = new aqez()));
    }
    
    private aqez() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqez.d) == null) {
                    synchronized (aqez.class) {
                        if (aqez.d == null) {
                            aqez.d = (ahdd)new ahba((ahbh)aqez.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqez.a;
            }
            case 4: {
                return new ahaz((ahbh)aqez.a);
            }
            case 3: {
                return new aqez();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqez.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
