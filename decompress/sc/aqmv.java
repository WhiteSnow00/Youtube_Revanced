import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmv extends ahbh implements ahcw
{
    public static final aqmv a;
    private static volatile ahdd d;
    public boolean b;
    public int c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmv.class, (ahbh)(a = new aqmv()));
    }
    
    private aqmv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqmv.d) == null) {
                    synchronized (aqmv.class) {
                        if (aqmv.d == null) {
                            aqmv.d = (ahdd)new ahba((ahbh)aqmv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqmv.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmv.a);
            }
            case 3: {
                return new aqmv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", aqls.c });
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
