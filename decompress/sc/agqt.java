import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqt extends ahbh implements ahcw
{
    public static final agqt a;
    private static volatile ahdd e;
    public int b;
    public agqq c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqt.class, (ahbh)(a = new agqt()));
    }
    
    private agqt() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agqt.e) == null) {
                    synchronized (agqt.class) {
                        if (agqt.e == null) {
                            agqt.e = (ahdd)new ahba((ahbh)agqt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqt.a;
            }
            case 4: {
                return new ahaz((ahbh)agqt.a);
            }
            case 3: {
                return new agqt();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
