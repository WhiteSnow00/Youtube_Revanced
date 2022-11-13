import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouq extends ahbh implements ahcw
{
    public static final aouq a;
    private static volatile ahdd d;
    public long b;
    public String c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aouq.class, (ahbh)(a = new aouq()));
    }
    
    private aouq() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aouq.d) == null) {
                    synchronized (aouq.class) {
                        if (aouq.d == null) {
                            aouq.d = (ahdd)new ahba((ahbh)aouq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aouq.a;
            }
            case 4: {
                return new ahaz((ahbh)aouq.a);
            }
            case 3: {
                return new aouq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aouq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
