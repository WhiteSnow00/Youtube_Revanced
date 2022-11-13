import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajck extends ahbh implements ahcw
{
    public static final ajck a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajck.class, (ahbh)(a = new ajck()));
    }
    
    private ajck() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajck.e) == null) {
                    synchronized (ajck.class) {
                        if (ajck.e == null) {
                            ajck.e = (ahdd)new ahba((ahbh)ajck.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajck.a;
            }
            case 4: {
                return new ahaz((ahbh)ajck.a);
            }
            case 3: {
                return new ajck();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajck.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
