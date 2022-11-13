import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrv extends ahbh implements ahcw
{
    public static final agrv a;
    private static volatile ahdd e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)agrv.class, (ahbh)(a = new agrv()));
    }
    
    private agrv() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = agrv.e) == null) {
                    synchronized (agrv.class) {
                        if (agrv.e == null) {
                            agrv.e = (ahdd)new ahba((ahbh)agrv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agrv.a;
            }
            case 4: {
                return new ahaz((ahbh)agrv.a);
            }
            case 3: {
                return new agrv();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "f", "b", "c", "d" });
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
