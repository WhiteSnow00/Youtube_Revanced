import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpd extends agzi implements ahax
{
    public static final ahpd a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public aioe e;
    public agyc f;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahpd.class, a = new ahpd());
    }
    
    private ahpd() {
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
                if ((g = ahpd.g) == null) {
                    synchronized (ahpd.class) {
                        if (ahpd.g == null) {
                            ahpd.g = (ahbe)new agzb((agzi)ahpd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahpd.a;
            }
            case 4: {
                return new agza((agzi)ahpd.a);
            }
            case 3: {
                return new ahpd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpd.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "h", "e", "f", "i" });
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