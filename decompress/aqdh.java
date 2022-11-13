import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdh extends ahbh implements ahcw
{
    public static final aqdh a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdh.class, (ahbh)(a = new aqdh()));
    }
    
    private aqdh() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqdh.d) == null) {
                    synchronized (aqdh.class) {
                        if (aqdh.d == null) {
                            aqdh.d = (ahdd)new ahba((ahbh)aqdh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqdh.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdh.a);
            }
            case 3: {
                return new aqdh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
