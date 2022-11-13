import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdl extends ahbh implements ahcw
{
    public static final ajdl a;
    private static volatile ahdd g;
    public boolean b;
    public ajdk c;
    public ajdk d;
    public ajdk e;
    public ajdk f;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdl.class, (ahbh)(a = new ajdl()));
    }
    
    private ajdl() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajdl.g) == null) {
                    synchronized (ajdl.class) {
                        if (ajdl.g == null) {
                            ajdl.g = (ahdd)new ahba((ahbh)ajdl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajdl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdl.a);
            }
            case 3: {
                return new ajdl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdl.a, "\u0001\u0005\u0000\u0001\u0001\u0190\u0005\u0000\u0000\u0000\u0001\u1007\u0000d\u1009\u0001\u00c8\u1009\u0002\u012c\u1009\u0003\u0190\u1009\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
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
