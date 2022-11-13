import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhl extends ahbh implements ahcw
{
    public static final ajhl a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajhl.class, (ahbh)(a = new ajhl()));
    }
    
    private ajhl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajhl.d) == null) {
                    synchronized (ajhl.class) {
                        if (ajhl.d == null) {
                            ajhl.d = (ahdd)new ahba((ahbh)ajhl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajhl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhl.a);
            }
            case 3: {
                return new ajhl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
