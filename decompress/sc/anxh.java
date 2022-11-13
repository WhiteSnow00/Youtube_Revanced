import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxh extends ahbh implements ahcw
{
    public static final anxh a;
    private static volatile ahdd d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anxh.class, (ahbh)(a = new anxh()));
    }
    
    private anxh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anxh.d) == null) {
                    synchronized (anxh.class) {
                        if (anxh.d == null) {
                            anxh.d = (ahdd)new ahba((ahbh)anxh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anxh.a;
            }
            case 4: {
                return new ahaz((ahbh)anxh.a);
            }
            case 3: {
                return new anxh();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
