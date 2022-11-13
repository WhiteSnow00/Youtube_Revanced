import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahll extends ahbh implements ahcw
{
    public static final ahll a;
    private static volatile ahdd i;
    public int b;
    public ahlm c;
    public ahqu d;
    public ahqq e;
    public ahqx f;
    public ahox g;
    public ajff h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ahll.class, (ahbh)(a = new ahll()));
    }
    
    private ahll() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = ahll.i) == null) {
                    synchronized (ahll.class) {
                        if (ahll.i == null) {
                            ahll.i = (ahdd)new ahba((ahbh)ahll.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahll.a;
            }
            case 4: {
                return new ahaz((ahbh)ahll.a);
            }
            case 3: {
                return new ahll();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahll.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1409\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
