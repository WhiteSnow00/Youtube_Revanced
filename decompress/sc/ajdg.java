import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdg extends ahbh implements ahcw
{
    public static final ajdg a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdg.class, (ahbh)(a = new ajdg()));
    }
    
    private ajdg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajdg.f) == null) {
                    synchronized (ajdg.class) {
                        if (ajdg.f == null) {
                            ajdg.f = (ahdd)new ahba((ahbh)ajdg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajdg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdg.a);
            }
            case 3: {
                return new ajdg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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
