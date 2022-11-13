import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfx extends ahbh implements ahcw
{
    public static final ajfx a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajfx.class, (ahbh)(a = new ajfx()));
    }
    
    private ajfx() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajfx.e) == null) {
                    synchronized (ajfx.class) {
                        if (ajfx.e == null) {
                            ajfx.e = (ahdd)new ahba((ahbh)ajfx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfx.a);
            }
            case 3: {
                return new ajfx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
