import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvb extends ahbh implements ahcw
{
    public static final anvb a;
    private static volatile ahdd d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anvb.class, (ahbh)(a = new anvb()));
    }
    
    private anvb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anvb.d) == null) {
                    synchronized (anvb.class) {
                        if (anvb.d == null) {
                            anvb.d = (ahdd)new ahba((ahbh)anvb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anvb.a;
            }
            case 4: {
                return new ahaz((ahbh)anvb.a);
            }
            case 3: {
                return new anvb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvb.a, "\u0001\u0002\u0000\u0001\r\u001f\u0002\u0000\u0000\u0000\r\u1007\n\u001f\u1007\u001a", new Object[] { "e", "b", "c" });
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
