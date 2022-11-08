import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwh extends agzi implements ahax
{
    public static final ahwh a;
    private static volatile ahbe g;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aibc f;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ahwh.class, a = new ahwh());
    }
    
    private ahwh() {
        this.j = 2;
        final agyc b = agyc.b;
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
                if ((g = ahwh.g) == null) {
                    synchronized (ahwh.class) {
                        if (ahwh.g == null) {
                            ahwh.g = (ahbe)new agzb((agzi)ahwh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahwh.a;
            }
            case 4: {
                return new agza((agzi)ahwh.a);
            }
            case 3: {
                return new ahwh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwh.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "h", "f", "i" });
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
