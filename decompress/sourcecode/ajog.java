import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajog extends agzi implements ahax
{
    public static final ajog a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajoh e;
    private ajof f;
    private anss g;
    private anss h;
    private anss i;
    private anss j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)ajog.class, (agzi)(a = new ajog()));
    }
    
    private ajog() {
        this.l = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = ajog.b) == null) {
                    synchronized (ajog.class) {
                        if (ajog.b == null) {
                            ajog.b = (ahbe)new agzb((agzi)ajog.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajog.a;
            }
            case 4: {
                return new agza((agzi)ajog.a);
            }
            case 3: {
                return new ajog();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajog.a, "\u0001\b\u0000\u0001\u0005\f\b\u0000\u0000\b\u0005\u1409\n\u0006\u1409\u0003\u0007\u1409\u0006\b\u1409\u0007\t\u1409\u0004\n\u1409\b\u000b\u1409\u0002\f\u1409\u0005", new Object[] { "c", "k", "e", "h", "i", "f", "j", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
