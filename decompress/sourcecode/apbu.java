import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbu extends agzi implements ahax
{
    public static final apbu a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ahyg j;
    private aioe k;
    private ahfw l;
    private ajsq m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(apbu.class, a = new apbu());
    }
    
    private apbu() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = apbu.b) == null) {
                    synchronized (apbu.class) {
                        if (apbu.b == null) {
                            apbu.b = (ahbe)new agzb((agzi)apbu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbu.a;
            }
            case 4: {
                return new agza((agzi)apbu.a);
            }
            case 3: {
                return new apbu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbu.a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\t\u1409\b\n\u1409\t\u000e\u1409\r\u000f\u1409\u0004\u0010\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "h", "m" });
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
