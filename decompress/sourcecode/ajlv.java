import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlv extends agzi implements ahax
{
    public static final ajlv a;
    private static volatile ahbe g;
    public int b;
    public ajsq c;
    public ajlw d;
    public ajlw e;
    public agyc f;
    private amer h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ajlv.class, (agzi)(a = new ajlv()));
    }
    
    private ajlv() {
        this.j = 2;
        this.f = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ajlv.g) == null) {
                    synchronized (ajlv.class) {
                        if (ajlv.g == null) {
                            ajlv.g = (ahbe)new agzb((agzi)ajlv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajlv.a;
            }
            case 4: {
                return new agza((agzi)ajlv.a);
            }
            case 3: {
                return new ajlv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlv.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1409\u0003", new Object[] { "b", "c", "d", "e", "i", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
