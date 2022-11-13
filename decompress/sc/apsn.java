import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsn extends ahbh implements ahcw
{
    public static final apsn a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    
    static {
        ahbh.registerDefaultInstance((Class)apsn.class, (ahbh)(a = new apsn()));
    }
    
    private apsn() {
        this.b = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apsn.d) == null) {
                    synchronized (apsn.class) {
                        if (apsn.d == null) {
                            apsn.d = (ahdd)new ahba((ahbh)apsn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsn.a;
            }
            case 4: {
                return new ahaz((ahbh)apsn.a);
            }
            case 3: {
                return new apsn();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsn.a, "\u0001\u0001\u0001\u0000\ufd80\u3d39\ufd80\u3d39\u0001\u0000\u0000\u0000\ufd80\u3d39\u103c\u0000", new Object[] { "c", "b", apsm.class });
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
