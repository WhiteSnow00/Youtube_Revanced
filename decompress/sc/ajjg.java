import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjg extends ahbh implements ahcw
{
    public static final ajjg a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjg.class, (ahbh)(a = new ajjg()));
    }
    
    private ajjg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajjg.e) == null) {
                    synchronized (ajjg.class) {
                        if (ajjg.e == null) {
                            ajjg.e = (ahdd)new ahba((ahbh)ajjg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajjg.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjg.a);
            }
            case 3: {
                return new ajjg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjg.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d" });
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
