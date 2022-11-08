import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidd extends agzi implements ahax
{
    public static final aidd a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aidd.class, (agzi)(a = new aidd()));
    }
    
    private aidd() {
        this.g = 2;
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
                if ((b2 = aidd.b) == null) {
                    synchronized (aidd.class) {
                        if (aidd.b == null) {
                            aidd.b = (ahbe)new agzb((agzi)aidd.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidd.a;
            }
            case 4: {
                return new agza((agzi)aidd.a);
            }
            case 3: {
                return new aidd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidd.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0003\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "f", "d", "e" });
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
