import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxw extends agzi implements ahax
{
    public static final ajxw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajxw.class, a = new ajxw());
    }
    
    private ajxw() {
        this.f = 2;
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
                if ((b2 = ajxw.b) == null) {
                    synchronized (ajxw.class) {
                        if (ajxw.b == null) {
                            ajxw.b = (ahbe)new agzb((agzi)ajxw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxw.a;
            }
            case 4: {
                return new agza((agzi)ajxw.a);
            }
            case 3: {
                return new ajxw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxw.a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0006\u1409\u0001", new Object[] { "c", "e", "d" });
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
