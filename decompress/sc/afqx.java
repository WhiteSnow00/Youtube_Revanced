import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqx extends ahbh implements ahcw
{
    public static final afqx a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)afqx.class, (ahbh)(a = new afqx()));
    }
    
    private afqx() {
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
                if ((e = afqx.e) == null) {
                    synchronized (afqx.class) {
                        if (afqx.e == null) {
                            afqx.e = (ahdd)new ahba((ahbh)afqx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afqx.a;
            }
            case 4: {
                return new ahaz((ahbh)afqx.a);
            }
            case 3: {
                return new afqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
