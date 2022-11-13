import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbh extends ahbh implements ahcw
{
    public static final arbh a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)arbh.class, (ahbh)(a = new arbh()));
    }
    
    private arbh() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = arbh.f) == null) {
                    synchronized (arbh.class) {
                        if (arbh.f == null) {
                            arbh.f = (ahdd)new ahba((ahbh)arbh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return arbh.a;
            }
            case 4: {
                return new ahaz((ahbh)arbh.a);
            }
            case 3: {
                return new arbh();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
