import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgw extends agzi implements ahax
{
    public static final ahgw a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public anss e;
    public agyc f;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahgw.class, a = new ahgw());
    }
    
    private ahgw() {
        this.j = 2;
        this.f = agyc.b;
    }
    
    @Override
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
                if ((g = ahgw.g) == null) {
                    synchronized (ahgw.class) {
                        if (ahgw.g == null) {
                            ahgw.g = (ahbe)new agzb((agzi)ahgw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahgw.a;
            }
            case 4: {
                return new agza((agzi)ahgw.a);
            }
            case 3: {
                return new ahgw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgw.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0004\u0002\u100a\u0005\u0003\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003", new Object[] { "b", "i", "f", "c", "d", "h", "e" });
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
