import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajed extends ahbh implements ahcw
{
    public static final ajed a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajed.class, (ahbh)(a = new ajed()));
    }
    
    private ajed() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajed.d) == null) {
                    synchronized (ajed.class) {
                        if (ajed.d == null) {
                            ajed.d = (ahdd)new ahba((ahbh)ajed.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajed.a;
            }
            case 4: {
                return new ahaz((ahbh)ajed.a);
            }
            case 3: {
                return new ajed();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajed.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
