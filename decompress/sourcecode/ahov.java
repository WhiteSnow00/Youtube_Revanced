import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahov extends agzi implements ahax
{
    public static final ahov a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private anss f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahov.class, a = new ahov());
    }
    
    private ahov() {
        this.g = 2;
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
                if ((b2 = ahov.b) == null) {
                    synchronized (ahov.class) {
                        if (ahov.b == null) {
                            ahov.b = (ahbe)new agzb((agzi)ahov.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahov.a;
            }
            case 4: {
                return new agza((agzi)ahov.a);
            }
            case 3: {
                return new ahov();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahov.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
