import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvx extends ahbh implements ahcw
{
    public static final ajvx a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public alvw d;
    private byte f;
    
    static {
        final ajvx a2 = new ajvx();
        ahbh.registerDefaultInstance((Class)ajvx.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgn.a, (Object)a2, (MessageLite)a2, (ahbm)null, 424548931, ahek.k, (Class)ajvx.class);
    }
    
    private ajvx() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajvx.e) == null) {
                    synchronized (ajvx.class) {
                        if (ajvx.e == null) {
                            ajvx.e = (ahdd)new ahba((ahbh)ajvx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajvx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvx.a);
            }
            case 3: {
                return new ajvx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvx.a, "\u0001\u0001\u0000\u0001\u03e7\u03e7\u0001\u0000\u0000\u0001\u03e7\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
