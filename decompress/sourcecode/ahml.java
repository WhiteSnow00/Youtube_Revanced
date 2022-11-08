import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahml extends agzi implements ahax
{
    public static final ahml a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private aioe k;
    private aibc l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance((Class)ahml.class, (agzi)(a = new ahml()));
    }
    
    private ahml() {
        this.n = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = ahml.b) == null) {
                    synchronized (ahml.class) {
                        if (ahml.b == null) {
                            ahml.b = (ahbe)new agzb((agzi)ahml.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahml.a;
            }
            case 4: {
                return new agza((agzi)ahml.a);
            }
            case 3: {
                return new ahml();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahml.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0005\u0004\u1409\u0006\u0005\u1409\u0007\b\u1409\t\t\u1409\u0002\n\u1409\u0003\f\u1409\u000b\r\u1409\u0004", new Object[] { "c", "d", "e", "i", "j", "k", "l", "f", "g", "m", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
