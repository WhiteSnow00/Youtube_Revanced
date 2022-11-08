import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amln extends agzd implements agze
{
    public static final amln a;
    private static volatile ahbe b;
    private int c;
    private amlo d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private amer h;
    private ahfw i;
    private amlm j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)amln.class, (agzi)(a = new amln()));
    }
    
    private amln() {
        this.k = 2;
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
                if ((b2 = amln.b) == null) {
                    synchronized (amln.class) {
                        if (amln.b == null) {
                            amln.b = (ahbe)new agzb((agzi)amln.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amln.a;
            }
            case 4: {
                return new agzc(amln.a);
            }
            case 3: {
                return new amln();
            }
            case 2: {
                return newMessageInfo((MessageLite)amln.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1409\u0006\t\u1409\u0005\u000b\u1409\t", new Object[] { "c", "d", "e", "f", "g", "i", "h", "j" });
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
