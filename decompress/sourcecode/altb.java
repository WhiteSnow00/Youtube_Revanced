import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altb extends agzi implements ahax
{
    public static final altb a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private alta f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private alta j;
    private ajsq k;
    private ajsq l;
    private alta m;
    private ajsq n;
    private ajsq o;
    private alta p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(altb.class, a = new altb());
    }
    
    private altb() {
        this.q = 2;
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
                if ((b2 = altb.b) == null) {
                    synchronized (altb.class) {
                        if (altb.b == null) {
                            altb.b = (ahbe)new agzb((agzi)altb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return altb.a;
            }
            case 4: {
                return new agza((agzi)altb.a);
            }
            case 3: {
                return new altb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)altb.a, "\u0001\r\u0000\u0001\u0003\u000f\r\u0000\u0000\r\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
