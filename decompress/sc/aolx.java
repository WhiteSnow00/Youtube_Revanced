import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolx extends ahbh implements ahcw
{
    public static final aolx a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahbh.registerDefaultInstance((Class)aolx.class, (ahbh)(a = new aolx()));
    }
    
    private aolx() {
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
                if ((e = aolx.e) == null) {
                    synchronized (aolx.class) {
                        if (aolx.e == null) {
                            aolx.e = (ahdd)new ahba((ahbh)aolx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aolx.a;
            }
            case 4: {
                return new ahaz((ahbh)aolx.a);
            }
            case 3: {
                return new aolx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
