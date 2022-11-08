import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aort extends agzi implements ahax
{
    public static final aort a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aort.class, a = new aort());
    }
    
    private aort() {
        this.g = 2;
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
                if ((b2 = aort.b) == null) {
                    synchronized (aort.class) {
                        if (aort.b == null) {
                            aort.b = (ahbe)new agzb((agzi)aort.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aort.a;
            }
            case 4: {
                return new agza((agzi)aort.a);
            }
            case 3: {
                return new aort();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aort.a, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0003\u0004\u1409\n\u0005\u1409\u000b\n\u1409\t", new Object[] { "c", "e", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
