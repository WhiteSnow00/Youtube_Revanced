import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiu extends agzi implements ahax
{
    public static final amiu a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ahpg k;
    private amer l;
    private ahfw m;
    private ally n;
    private ajsq o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)amiu.class, (agzi)(a = new amiu()));
    }
    
    private amiu() {
        this.p = 2;
        emptyProtobufList();
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
                if ((b2 = amiu.b) == null) {
                    synchronized (amiu.class) {
                        if (amiu.b == null) {
                            amiu.b = (ahbe)new agzb((agzi)amiu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amiu.a;
            }
            case 4: {
                return new agza((agzi)amiu.a);
            }
            case 3: {
                return new amiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiu.a, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0000\f\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\f\u1409\n\u000f\u1409\r\u0011\u1409\u000f\u0012\u1409\u0010\u0013\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l" });
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
