import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxa extends agzi implements ahax
{
    public static final ajxa a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private aioe i;
    private ajsq j;
    private amer k;
    private ahfw l;
    private ajsq m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(ajxa.class, a = new ajxa());
    }
    
    private ajxa() {
        this.n = 2;
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
                if ((b2 = ajxa.b) == null) {
                    synchronized (ajxa.class) {
                        if (ajxa.b == null) {
                            ajxa.b = (ahbe)new agzb((agzi)ajxa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxa.a;
            }
            case 4: {
                return new agza((agzi)ajxa.a);
            }
            case 3: {
                return new ajxa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxa.a, "\u0001\n\u0000\u0001\u0003\u0010\n\u0000\u0000\n\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\f\u1409\u000b\u000e\u1409\r\u000f\u1409\u0004\u0010\u1409\t", new Object[] { "c", "d", "e", "g", "h", "i", "j", "l", "m", "f", "k" });
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
