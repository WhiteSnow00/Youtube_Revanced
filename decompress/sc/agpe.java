import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpe extends ahbh implements ahcw
{
    public static final agpe a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)agpe.class, (ahbh)(a = new agpe()));
    }
    
    private agpe() {
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
                if ((f = agpe.f) == null) {
                    synchronized (agpe.class) {
                        if (agpe.f == null) {
                            agpe.f = (ahdd)new ahba((ahbh)agpe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpe.a;
            }
            case 4: {
                return new ahaz((ahbh)agpe.a);
            }
            case 3: {
                return new agpe();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpe.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
