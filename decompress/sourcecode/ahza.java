import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahza extends agzi implements ahax
{
    public static final ahza a;
    private static volatile ahbe b;
    private int c;
    private ahyz d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahza.class, a = new ahza());
    }
    
    private ahza() {
        this.g = 2;
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
                final ahbe b2;
                if ((b2 = ahza.b) == null) {
                    synchronized (ahza.class) {
                        if (ahza.b == null) {
                            ahza.b = (ahbe)new agzb((agzi)ahza.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahza.a;
            }
            case 4: {
                return new agza((agzi)ahza.a);
            }
            case 3: {
                return new ahza();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahza.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
