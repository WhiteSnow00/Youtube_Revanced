import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlx extends ahbh implements ahcw
{
    public static final amlx a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)amlx.class, (ahbh)(a = new amlx()));
    }
    
    private amlx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = amlx.e) == null) {
                    synchronized (amlx.class) {
                        if (amlx.e == null) {
                            amlx.e = (ahdd)new ahba((ahbh)amlx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amlx.a;
            }
            case 4: {
                return new ahaz((ahbh)amlx.a);
            }
            case 3: {
                return new amlx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
