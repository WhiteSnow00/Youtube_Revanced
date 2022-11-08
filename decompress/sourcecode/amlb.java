import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlb extends agzd implements agze
{
    public static final amlb a;
    private static volatile ahbe b;
    private int c;
    private amlc d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ally h;
    private amer i;
    private ahfw j;
    private ajsq k;
    private amla m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance((Class)amlb.class, (agzi)(a = new amlb()));
    }
    
    private amlb() {
        this.n = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = amlb.b) == null) {
                    synchronized (amlb.class) {
                        if (amlb.b == null) {
                            amlb.b = (ahbe)new agzb((agzi)amlb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amlb.a;
            }
            case 4: {
                return new agzc(amlb.a);
            }
            case 3: {
                return new amlb();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlb.a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1409\b\t\u1409\u0005\u000b\u1409\u0007\r\u1409\u000b\u0010\u1409\r", new Object[] { "c", "d", "e", "f", "g", "j", "h", "i", "k", "m" });
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
