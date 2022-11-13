import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptv extends ahbh implements ahcw
{
    public static final aptv a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aptv.class, (ahbh)(a = new aptv()));
    }
    
    private aptv() {
        this.c = "";
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
                if ((e = aptv.e) == null) {
                    synchronized (aptv.class) {
                        if (aptv.e == null) {
                            aptv.e = (ahdd)new ahba((ahbh)aptv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aptv.a;
            }
            case 4: {
                return new ahaz((ahbh)aptv.a);
            }
            case 3: {
                return new aptv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
