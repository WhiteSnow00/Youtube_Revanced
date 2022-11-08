import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvs extends agzi implements ahax
{
    public static final ahvs a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private aioe h;
    private akve i;
    private ajsq j;
    private ahfw k;
    private ally l;
    private aibi m;
    private amer n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(ahvs.class, a = new ahvs());
    }
    
    private ahvs() {
        this.o = 2;
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
                if ((b2 = ahvs.b) == null) {
                    synchronized (ahvs.class) {
                        if (ahvs.b == null) {
                            ahvs.b = (ahbe)new agzb((agzi)ahvs.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahvs.a;
            }
            case 4: {
                return new agza((agzi)ahvs.a);
            }
            case 3: {
                return new ahvs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvs.a, "\u0001\u000b\u0000\u0001\u0002\u0010\u000b\u0000\u0000\u000b\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1409\u0006\u0007\u1409\b\b\u1409\n\n\u1409\u000b\f\u1409\r\u000e\u1409\u000f\u000f\u1409\u0007\u0010\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "n", "h", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
