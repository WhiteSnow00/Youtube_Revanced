import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajee extends ahbh implements ahcw
{
    public static final ajee a;
    private static volatile ahdd g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajee.class, (ahbh)(a = new ajee()));
    }
    
    private ajee() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajee.g) == null) {
                    synchronized (ajee.class) {
                        if (ajee.g == null) {
                            ajee.g = (ahdd)new ahba((ahbh)ajee.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajee.a;
            }
            case 4: {
                return new ahaz((ahbh)ajee.a);
            }
            case 3: {
                return new ajee();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajee.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
