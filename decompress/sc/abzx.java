import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abzx extends ahbh implements ahcw
{
    public static final abzx a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public long d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)abzx.class, (ahbh)(a = new abzx()));
    }
    
    private abzx() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = abzx.f) == null) {
                    synchronized (abzx.class) {
                        if (abzx.f == null) {
                            abzx.f = (ahdd)new ahba((ahbh)abzx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return abzx.a;
            }
            case 4: {
                return new ahaz((ahbh)abzx.a);
            }
            case 3: {
                return new abzx();
            }
            case 2: {
                return newMessageInfo((MessageLite)abzx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1003\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
