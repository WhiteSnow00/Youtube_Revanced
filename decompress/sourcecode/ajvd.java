import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvd extends agzi implements ahax
{
    public static final ajvd a;
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
    private apdo l;
    private amer m;
    private ajuy n;
    private ajvc o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajvd.class, a = new ajvd());
    }
    
    private ajvd() {
        this.q = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = ajvd.b) == null) {
                    synchronized (ajvd.class) {
                        if (ajvd.b == null) {
                            ajvd.b = (ahbe)new agzb((agzi)ajvd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajvd.a;
            }
            case 4: {
                return new agza((agzi)ajvd.a);
            }
            case 3: {
                return new ajvd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvd.a, "\u0001\r\u0000\u0001\u0003\u0015\r\u0000\u0000\r\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b\u0010\u1409\f\u0011\u1409\r\u0014\u1409\u0011\u0015\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "o" });
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
