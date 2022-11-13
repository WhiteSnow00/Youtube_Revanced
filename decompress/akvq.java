import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvq extends ahbh implements ahcw
{
    public static final akvq a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahbh.registerDefaultInstance((Class)akvq.class, (ahbh)(a = new akvq()));
    }
    
    private akvq() {
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
                if ((e = akvq.e) == null) {
                    synchronized (akvq.class) {
                        if (akvq.e == null) {
                            akvq.e = (ahdd)new ahba((ahbh)akvq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akvq.a;
            }
            case 4: {
                return new ahaz((ahbh)akvq.a);
            }
            case 3: {
                return new akvq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
