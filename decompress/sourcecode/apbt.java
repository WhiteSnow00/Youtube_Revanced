import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbt extends agzi implements ahax
{
    public static final apbt a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(apbt.class, a = new apbt());
    }
    
    private apbt() {
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
                if ((b2 = apbt.b) == null) {
                    synchronized (apbt.class) {
                        if (apbt.b == null) {
                            apbt.b = (ahbe)new agzb((agzi)apbt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbt.a;
            }
            case 4: {
                return new agza((agzi)apbt.a);
            }
            case 3: {
                return new apbt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbt.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
