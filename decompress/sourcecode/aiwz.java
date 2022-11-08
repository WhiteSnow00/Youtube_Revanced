import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwz extends agzi implements ahax
{
    public static final aiwz a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private aioe f;
    private aioe g;
    private aioe h;
    private aioe i;
    private aioe j;
    private aioe k;
    private ajzn l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aiwz.class, a = new aiwz());
    }
    
    private aiwz() {
        this.n = 2;
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
                if ((b2 = aiwz.b) == null) {
                    synchronized (aiwz.class) {
                        if (aiwz.b == null) {
                            aiwz.b = (ahbe)new agzb((agzi)aiwz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwz.a;
            }
            case 4: {
                return new agza((agzi)aiwz.a);
            }
            case 3: {
                return new aiwz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwz.a, "\u0001\n\u0000\u0001\u0002\u0013\n\u0000\u0000\n\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0012\u000b\u1409\u0007\r\u1409\t\u0010\u1409\f\u0012\u1409\u000e\u0013\u1409\u000f", new Object[] { "c", "d", "e", "f", "g", "m", "h", "i", "j", "k", "l" });
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
