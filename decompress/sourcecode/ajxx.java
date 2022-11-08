import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxx extends agzi implements ahax
{
    public static final ajxx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajxx.class, a = new ajxx());
    }
    
    private ajxx() {
        this.f = 2;
        emptyProtobufList();
        emptyIntList();
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
                if ((b2 = ajxx.b) == null) {
                    synchronized (ajxx.class) {
                        if (ajxx.b == null) {
                            ajxx.b = (ahbe)new agzb((agzi)ajxx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxx.a;
            }
            case 4: {
                return new agza((agzi)ajxx.a);
            }
            case 3: {
                return new ajxx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxx.a, "\u0001\u0002\u0000\u0001\u0006\b\u0002\u0000\u0000\u0002\u0006\u1409\u0003\b\u1409\u0001", new Object[] { "c", "e", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
