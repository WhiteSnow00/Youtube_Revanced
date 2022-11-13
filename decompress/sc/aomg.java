import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomg extends ahbh implements ahcw
{
    public static final aomg a;
    private static volatile ahdd f;
    public int b;
    public aosh c;
    public aosh d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomg.class, (ahbh)(a = new aomg()));
    }
    
    private aomg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aomg.f) == null) {
                    synchronized (aomg.class) {
                        if (aomg.f == null) {
                            aomg.f = (ahdd)new ahba((ahbh)aomg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aomg.a;
            }
            case 4: {
                return new ahaz((ahbh)aomg.a);
            }
            case 3: {
                return new aomg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
