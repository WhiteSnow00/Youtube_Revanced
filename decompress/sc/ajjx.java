import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjx extends ahbh implements ahcw
{
    public static final ajjx a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjx.class, (ahbh)(a = new ajjx()));
    }
    
    private ajjx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajjx.e) == null) {
                    synchronized (ajjx.class) {
                        if (ajjx.e == null) {
                            ajjx.e = (ahdd)new ahba((ahbh)ajjx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajjx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjx.a);
            }
            case 3: {
                return new ajjx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjx.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d" });
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
