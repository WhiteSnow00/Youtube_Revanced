import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplp extends agzi implements ahax
{
    public static final aplp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aplr f;
    private aplq g;
    private aioe h;
    private anss i;
    private ajsq j;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private ajsq n;
    private ajsq o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(aplp.class, a = new aplp());
    }
    
    private aplp() {
        this.q = 2;
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
                if ((b2 = aplp.b) == null) {
                    synchronized (aplp.class) {
                        if (aplp.b == null) {
                            aplp.b = (ahbe)new agzb((agzi)aplp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aplp.a;
            }
            case 4: {
                return new agza((agzi)aplp.a);
            }
            case 3: {
                return new aplp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplp.a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0011\b\u1409\u0004\t\u1409\u0005\u000e\u1409\t\u000f\u1409\u000b\u0010\u1409\f\u0013\u1409\u0010\u0014\u1409\r\u0015\u1409\n", new Object[] { "c", "d", "e", "f", "g", "p", "h", "i", "j", "l", "m", "o", "n", "k" });
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
