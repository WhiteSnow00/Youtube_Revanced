import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpm extends ahbh implements ahcw
{
    public static final agpm a;
    private static volatile ahdd e;
    public agqi b;
    public agpu c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)agpm.class, (ahbh)(a = new agpm()));
    }
    
    private agpm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agpm.e) == null) {
                    synchronized (agpm.class) {
                        if (agpm.e == null) {
                            agpm.e = (ahdd)new ahba((ahbh)agpm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpm.a;
            }
            case 4: {
                return new ahaz((ahbh)agpm.a);
            }
            case 3: {
                return new agpm();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpm.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "b", "c", "d" });
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
