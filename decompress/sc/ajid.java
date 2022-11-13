import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajid extends ahbh implements ahcw
{
    public static final ajid a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajid.class, (ahbh)(a = new ajid()));
    }
    
    private ajid() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajid.d) == null) {
                    synchronized (ajid.class) {
                        if (ajid.d == null) {
                            ajid.d = (ahdd)new ahba((ahbh)ajid.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajid.a;
            }
            case 4: {
                return new ahaz((ahbh)ajid.a);
            }
            case 3: {
                return new ajid();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajid.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1007\u0000", new Object[] { "b", "c" });
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
