import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxv extends agzi implements ahax
{
    public static final ajxv a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ajxv.class, a = new ajxv());
    }
    
    private ajxv() {
        this.h = 2;
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
                if ((b2 = ajxv.b) == null) {
                    synchronized (ajxv.class) {
                        if (ajxv.b == null) {
                            ajxv.b = (ahbe)new agzb((agzi)ajxv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxv.a;
            }
            case 4: {
                return new agza((agzi)ajxv.a);
            }
            case 3: {
                return new ajxv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxv.a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0004\u0002\u1409\u0002\u0006\u1409\u0004\b\u1409\u0001\t\u1409\u0003", new Object[] { "c", "e", "g", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
