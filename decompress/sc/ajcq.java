import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcq extends ahbh implements ahcw
{
    public static final ajcq a;
    private static volatile ahdd e;
    public int b;
    public akli c;
    public anuv d;
    private ajvo f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajcq.class, (ahbh)(a = new ajcq()));
    }
    
    private ajcq() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajcq.e) == null) {
                    synchronized (ajcq.class) {
                        if (ajcq.e == null) {
                            ajcq.e = (ahdd)new ahba((ahbh)ajcq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajcq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajcq.a);
            }
            case 3: {
                return new ajcq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajcq.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}