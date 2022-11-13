import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiu extends ahbh implements ahcw
{
    public static final aoiu a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiu.class, (ahbh)(a = new aoiu()));
    }
    
    private aoiu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aoiu.e) == null) {
                    synchronized (aoiu.class) {
                        if (aoiu.e == null) {
                            aoiu.e = (ahdd)new ahba((ahbh)aoiu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoiu.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiu.a);
            }
            case 3: {
                return new aoiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", aoet.q, "d" });
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
