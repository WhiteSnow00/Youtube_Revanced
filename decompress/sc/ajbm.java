import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbm extends ahbh implements ahcw
{
    public static final ajbm a;
    private static volatile ahdd e;
    public alwh b;
    public boolean c;
    public boolean d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbm.class, (ahbh)(a = new ajbm()));
    }
    
    private ajbm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajbm.e) == null) {
                    synchronized (ajbm.class) {
                        if (ajbm.e == null) {
                            ajbm.e = (ahdd)new ahba((ahbh)ajbm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajbm.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbm.a);
            }
            case 3: {
                return new ajbm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbm.a, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u000e\u1007\r\u000f\u1007\u000e", new Object[] { "f", "b", "c", "d" });
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
