import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbs extends ahbh implements ahcw
{
    public static final ajbs a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public long d;
    public boolean e;
    public String f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajbs.class, (ahbh)(a = new ajbs()));
    }
    
    private ajbs() {
        this.c = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajbs.g) == null) {
                    synchronized (ajbs.class) {
                        if (ajbs.g == null) {
                            ajbs.g = (ahdd)new ahba((ahbh)ajbs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajbs.a;
            }
            case 4: {
                return new ahaz((ahbh)ajbs.a);
            }
            case 3: {
                return new ajbs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajbs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
