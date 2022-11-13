import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqe extends ahbh implements ahcw
{
    public static final agqe a;
    private static volatile ahdd h;
    public agqb b;
    public agpz c;
    public agpy d;
    public agqa e;
    public agpv f;
    public agpw g;
    private ahcr i;
    
    static {
        ahbh.registerDefaultInstance((Class)agqe.class, (ahbh)(a = new agqe()));
    }
    
    private agqe() {
        this.i = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = agqe.h) == null) {
                    synchronized (agqe.class) {
                        if (agqe.h == null) {
                            agqe.h = (ahdd)new ahba((ahbh)agqe.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return agqe.a;
            }
            case 4: {
                return new ahaz((ahbh)agqe.a);
            }
            case 3: {
                return new agqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqe.a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[] { "b", "c", "d", "f", "i", agqd.a, "e", "g" });
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
