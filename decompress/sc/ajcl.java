import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcl extends ahbh implements ahcw
{
    public static final ajcl a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcl.class, (ahbh)(a = new ajcl()));
    }
    
    private ajcl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajcl.e) == null) {
                    synchronized (ajcl.class) {
                        if (ajcl.e == null) {
                            ajcl.e = (ahdd)new ahba((ahbh)ajcl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajcl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcl.a);
            }
            case 3: {
                return new ajcl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
