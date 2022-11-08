import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aics extends agzi implements ahax
{
    public static final aics a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private aicu e;
    private anss f;
    private ahfw g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aics.class, (agzi)(a = new aics()));
    }
    
    private aics() {
        this.i = 2;
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
                if ((b2 = aics.b) == null) {
                    synchronized (aics.class) {
                        if (aics.b == null) {
                            aics.b = (ahbe)new agzb((agzi)aics.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aics.a;
            }
            case 4: {
                return new agza((agzi)aics.a);
            }
            case 3: {
                return new aics();
            }
            case 2: {
                return newMessageInfo((MessageLite)aics.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0005\u0005\u1409\u0002\u0007\u1409\u0003\t\u1409\u0007", new Object[] { "c", "d", "g", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
