import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqx extends ahbh implements ahcw
{
    public static final agqx a;
    private static volatile ahdd h;
    public int b;
    public int c;
    public Object d;
    public agqq e;
    public String f;
    public agra g;
    
    static {
        ahbh.registerDefaultInstance((Class)agqx.class, (ahbh)(a = new agqx()));
    }
    
    private agqx() {
        this.c = 0;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = agqx.h) == null) {
                    synchronized (agqx.class) {
                        if (agqx.h == null) {
                            agqx.h = (ahdd)new ahba((ahbh)agqx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agqx.a;
            }
            case 4: {
                return new ahaz((ahbh)agqx.a);
            }
            case 3: {
                return new agqx();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqx.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u103a\u0000\u0005\u1009\u0004", new Object[] { "d", "c", "b", "e", "f", "g" });
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
