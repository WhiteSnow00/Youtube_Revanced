import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprp extends agzi implements ahax
{
    public static final aprp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private anss h;
    private ahfw i;
    private apro j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)aprp.class, (agzi)(a = new aprp()));
    }
    
    private aprp() {
        this.k = 2;
        agzi.emptyProtobufList();
        emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((b2 = aprp.b) == null) {
                    synchronized (aprp.class) {
                        if (aprp.b == null) {
                            aprp.b = (ahbe)new agzb((agzi)aprp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aprp.a;
            }
            case 4: {
                return new agza((agzi)aprp.a);
            }
            case 3: {
                return new aprp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprp.a, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\t\u0010\u1409\r", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
