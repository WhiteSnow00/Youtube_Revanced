import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajve extends ahbh implements ahcw
{
    public static final ajve a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public String e;
    public boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajve.class, (ahbh)(a = new ajve()));
    }
    
    private ajve() {
        this.c = 0;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajve.g) == null) {
                    synchronized (ajve.class) {
                        if (ajve.g == null) {
                            ajve.g = (ahdd)new ahba((ahbh)ajve.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajve.a;
            }
            case 4: {
                return new ahaz((ahbh)ajve.a);
            }
            case 3: {
                return new ajve();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajve.a, "\u0001\u0003\u0001\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003\u1007\u0001\u0004\u103c\u0000\u0006\u1008\u0000", new Object[] { "d", "c", "b", "f", ajvf.class, "e" });
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
