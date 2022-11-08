import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwx extends agzi implements ahax
{
    public static final aiwx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aiwx.class, a = new aiwx());
    }
    
    private aiwx() {
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
                if ((b2 = aiwx.b) == null) {
                    synchronized (aiwx.class) {
                        if (aiwx.b == null) {
                            aiwx.b = (ahbe)new agzb((agzi)aiwx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwx.a;
            }
            case 4: {
                return new agza((agzi)aiwx.a);
            }
            case 3: {
                return new aiwx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwx.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002\u1409\u0002\u0003\u1409\u0003\u0006\u1409\u0006", new Object[] { "c", "d", "e", "f" });
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
