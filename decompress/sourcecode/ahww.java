import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahww extends agzi implements ahax
{
    public static final ahww a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aibc e;
    private ajsq f;
    private aibc g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ahwy l;
    private ajsq m;
    private ajsq n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(ahww.class, a = new ahww());
    }
    
    private ahww() {
        this.p = 2;
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
                if ((b2 = ahww.b) == null) {
                    synchronized (ahww.class) {
                        if (ahww.b == null) {
                            ahww.b = (ahbe)new agzb((agzi)ahww.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahww.a;
            }
            case 4: {
                return new agza((agzi)ahww.a);
            }
            case 3: {
                return new ahww();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahww.a, "\u0001\f\u0000\u0001\u0002\u000e\f\u0000\u0000\f\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b\u000e\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
