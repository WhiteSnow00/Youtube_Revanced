import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aonr extends agzi implements ahax
{
    public static final aonr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aonq e;
    private ajsq f;
    private aonp g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aonr.class, (agzi)(a = new aonr()));
    }
    
    private aonr() {
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
                if ((b2 = aonr.b) == null) {
                    synchronized (aonr.class) {
                        if (aonr.b == null) {
                            aonr.b = (ahbe)new agzb((agzi)aonr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aonr.a;
            }
            case 4: {
                return new agza((agzi)aonr.a);
            }
            case 3: {
                return new aonr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
