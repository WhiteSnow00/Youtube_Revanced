import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmm extends ahbh implements ahcw
{
    public static final akmm a;
    private static volatile ahdd d;
    public int b;
    public ahan c;
    
    static {
        ahbh.registerDefaultInstance((Class)akmm.class, (ahbh)(a = new akmm()));
    }
    
    private akmm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akmm.d) == null) {
                    synchronized (akmm.class) {
                        if (akmm.d == null) {
                            akmm.d = (ahdd)new ahba((ahbh)akmm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmm.a;
            }
            case 4: {
                return new ahaz((ahbh)akmm.a);
            }
            case 3: {
                return new akmm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
