import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aono extends agzi implements ahax
{
    public static final aono a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aonq e;
    private ajsq f;
    private aonp g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aono.class, (agzi)(a = new aono()));
    }
    
    private aono() {
        this.i = 2;
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
                if ((b2 = aono.b) == null) {
                    synchronized (aono.class) {
                        if (aono.b == null) {
                            aono.b = (ahbe)new agzb((agzi)aono.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aono.a;
            }
            case 4: {
                return new agza((agzi)aono.a);
            }
            case 3: {
                return new aono();
            }
            case 2: {
                return newMessageInfo((MessageLite)aono.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
