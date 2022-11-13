import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsg extends ahbh implements ahcw
{
    public static final aqsg a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsg.class, (ahbh)(a = new aqsg()));
    }
    
    private aqsg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqsg.d) == null) {
                    synchronized (aqsg.class) {
                        if (aqsg.d == null) {
                            aqsg.d = (ahdd)new ahba((ahbh)aqsg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqsg.a);
            }
            case 3: {
                return new aqsg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
