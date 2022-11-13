import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajun extends ahbh implements ahcw
{
    public static final ajun a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajun.class, (ahbh)(a = new ajun()));
    }
    
    private ajun() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajun.e) == null) {
                    synchronized (ajun.class) {
                        if (ajun.e == null) {
                            ajun.e = (ahdd)new ahba((ahbh)ajun.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajun.a;
            }
            case 4: {
                return new ahaz((ahbh)ajun.a);
            }
            case 3: {
                return new ajun();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajun.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d" });
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
