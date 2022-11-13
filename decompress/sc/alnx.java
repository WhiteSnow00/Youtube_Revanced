import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnx extends ahbh implements ahcw
{
    public static final alnx a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)alnx.class, (ahbh)(a = new alnx()));
    }
    
    private alnx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = alnx.g) == null) {
                    synchronized (alnx.class) {
                        if (alnx.g == null) {
                            alnx.g = (ahdd)new ahba((ahbh)alnx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alnx.a;
            }
            case 4: {
                return new ahaz((ahbh)alnx.a);
            }
            case 3: {
                return new alnx();
            }
            case 2: {
                return newMessageInfo((MessageLite)alnx.a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0005\u100b\u0005\u0006\u100b\u0006\n\u100b\u0003", new Object[] { "h", "b", "c", "e", "f", "d" });
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
