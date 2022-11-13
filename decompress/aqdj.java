import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdj extends ahbh implements ahcw
{
    public static final aqdj a;
    private static volatile ahdd d;
    public int b;
    public ahdy c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdj.class, (ahbh)(a = new aqdj()));
    }
    
    private aqdj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqdj.d) == null) {
                    synchronized (aqdj.class) {
                        if (aqdj.d == null) {
                            aqdj.d = (ahdd)new ahba((ahbh)aqdj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqdj.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdj.a);
            }
            case 3: {
                return new aqdj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
