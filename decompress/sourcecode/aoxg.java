import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxg extends agzi implements ahax
{
    public static final aoxg a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private ajsq e;
    private ajsq f;
    private ahfw g;
    private aoxh h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aoxg.class, a = new aoxg());
    }
    
    private aoxg() {
        this.i = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = aoxg.b) == null) {
                    synchronized (aoxg.class) {
                        if (aoxg.b == null) {
                            aoxg.b = (ahbe)new agzb((agzi)aoxg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aoxg.a;
            }
            case 4: {
                return new agza((agzi)aoxg.a);
            }
            case 3: {
                return new aoxg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxg.a, "\u0001\u0005\u0000\u0001\u0003\u000e\u0005\u0000\u0000\u0005\u0003\u1409\u0006\u0005\u1409\u0002\t\u1409\u0004\n\u1409\u0005\u000e\u1409\n", new Object[] { "c", "g", "d", "e", "f", "h" });
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