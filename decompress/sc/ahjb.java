import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjb extends ahbh implements ahcw
{
    public static final ahjb a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjb.class, (ahbh)(a = new ahjb()));
    }
    
    private ahjb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahjb.d) == null) {
                    synchronized (ahjb.class) {
                        if (ahjb.d == null) {
                            ahjb.d = (ahdd)new ahba((ahbh)ahjb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjb.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjb.a);
            }
            case 3: {
                return new ahjb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
