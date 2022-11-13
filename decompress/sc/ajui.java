import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajui extends ahbh implements ahcw
{
    public static final ajui a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajui.class, (ahbh)(a = new ajui()));
    }
    
    private ajui() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajui.c) == null) {
                    synchronized (ajui.class) {
                        if (ajui.c == null) {
                            ajui.c = (ahdd)new ahba((ahbh)ajui.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajui.a;
            }
            case 4: {
                return new ahaz((ahbh)ajui.a);
            }
            case 3: {
                return new ajui();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajui.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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
