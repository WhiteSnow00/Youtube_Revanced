import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajps extends agzi implements ahax
{
    public static final ajps a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajps.class, (agzi)(a = new ajps()));
    }
    
    private ajps() {
        this.f = 2;
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
                if ((b2 = ajps.b) == null) {
                    synchronized (ajps.class) {
                        if (ajps.b == null) {
                            ajps.b = (ahbe)new agzb((agzi)ajps.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajps.a;
            }
            case 4: {
                return new agza((agzi)ajps.a);
            }
            case 3: {
                return new ajps();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajps.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
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
