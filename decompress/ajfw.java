import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfw extends ahbh implements ahcw
{
    public static final ajfw a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfw.class, (ahbh)(a = new ajfw()));
    }
    
    private ajfw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajfw.e) == null) {
                    synchronized (ajfw.class) {
                        if (ajfw.e == null) {
                            ajfw.e = (ahdd)new ahba((ahbh)ajfw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfw.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfw.a);
            }
            case 3: {
                return new ajfw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", ajek.f, "d" });
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
