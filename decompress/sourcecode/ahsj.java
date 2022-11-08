import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahsj extends agzi implements ahax
{
    public static final ahsj a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahsj.class, a = new ahsj());
    }
    
    private ahsj() {
        this.g = 2;
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = ahsj.b) == null) {
                    synchronized (ahsj.class) {
                        if (ahsj.b == null) {
                            ahsj.b = (ahbe)new agzb((agzi)ahsj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahsj.a;
            }
            case 4: {
                return new agza((agzi)ahsj.a);
            }
            case 3: {
                return new ahsj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahsj.a, "\u0001\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0000\u0003\u0006\u1409\u0005\t\u1409\u0006\u000b\u1409\u0007", new Object[] { "c", "d", "e", "f" });
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
