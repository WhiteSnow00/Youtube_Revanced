import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqff extends ahbh implements ahcw
{
    public static final aqff a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqff.class, (ahbh)(a = new aqff()));
    }
    
    private aqff() {
        this.c = "";
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqff.e) == null) {
                    synchronized (aqff.class) {
                        if (aqff.e == null) {
                            aqff.e = (ahdd)new ahba((ahbh)aqff.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqff.a;
            }
            case 4: {
                return new ahaz((ahbh)aqff.a);
            }
            case 3: {
                return new aqff();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqff.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
