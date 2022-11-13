import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbx extends ahbh implements ahcw
{
    public static final ajbx a;
    private static volatile ahdd h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbx.class, (ahbh)(a = new ajbx()));
    }
    
    private ajbx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajbx.h) == null) {
                    synchronized (ajbx.class) {
                        if (ajbx.h == null) {
                            ajbx.h = (ahdd)new ahba((ahbh)ajbx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajbx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbx.a);
            }
            case 3: {
                return new ajbx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbx.a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0000\u0004\u100c\u0003\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b", new Object[] { "b", "c", airy.n, "d", "e", "f", "g" });
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
