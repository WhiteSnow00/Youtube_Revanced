import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdk extends ahbh implements ahcw
{
    public static final ajdk a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)ajdk.class, (ahbh)(a = new ajdk()));
    }
    
    private ajdk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajdk.f) == null) {
                    synchronized (ajdk.class) {
                        if (ajdk.f == null) {
                            ajdk.f = (ahdd)new ahba((ahbh)ajdk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajdk.a;
            }
            case 4: {
                return new ahaz((ahbh)ajdk.a);
            }
            case 3: {
                return new ajdk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajdk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", airy.u });
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
