import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqv extends ahbh implements ahcw
{
    public static final agqv a;
    private static volatile ahdd e;
    public int b;
    public agqq c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)agqv.class, (ahbh)(a = new agqv()));
    }
    
    private agqv() {
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
                if ((e = agqv.e) == null) {
                    synchronized (agqv.class) {
                        if (agqv.e == null) {
                            agqv.e = (ahdd)new ahba((ahbh)agqv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqv.a;
            }
            case 4: {
                return new ahaz((ahbh)agqv.a);
            }
            case 3: {
                return new agqv();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
