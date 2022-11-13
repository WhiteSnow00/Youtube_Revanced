import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajij extends ahbh implements ahcw
{
    public static final ajij a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ajij.class, (ahbh)(a = new ajij()));
    }
    
    private ajij() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajij.d) == null) {
                    synchronized (ajij.class) {
                        if (ajij.d == null) {
                            ajij.d = (ahdd)new ahba((ahbh)ajij.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajij.a;
            }
            case 4: {
                return new ahaz((ahbh)ajij.a);
            }
            case 3: {
                return new ajij();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajij.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
