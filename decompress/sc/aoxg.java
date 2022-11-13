import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxg extends ahbh implements ahcw
{
    public static final aoxg a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    private int j;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxg.class, (ahbh)(a = new aoxg()));
    }
    
    private aoxg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aoxg.i) == null) {
                    synchronized (aoxg.class) {
                        if (aoxg.i == null) {
                            aoxg.i = (ahdd)new ahba((ahbh)aoxg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoxg.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxg.a);
            }
            case 3: {
                return new aoxg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxg.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
