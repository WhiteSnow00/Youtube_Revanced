import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbt extends agzi implements ahax
{
    public static final ajbt a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajbt.class, a = new ajbt());
    }
    
    private ajbt() {
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
                if ((b2 = ajbt.b) == null) {
                    synchronized (ajbt.class) {
                        if (ajbt.b == null) {
                            ajbt.b = (ahbe)new agzb((agzi)ajbt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajbt.a;
            }
            case 4: {
                return new agza((agzi)ajbt.a);
            }
            case 3: {
                return new ajbt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbt.a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003\u1409\u0003\u0005\u1409\u0000\u0006\u1409\u0001", new Object[] { "c", "f", "d", "e" });
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
