import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisw extends agzi implements ahax
{
    public static final aisw a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aisw.class, a = new aisw());
    }
    
    private aisw() {
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
                if ((b2 = aisw.b) == null) {
                    synchronized (aisw.class) {
                        if (aisw.b == null) {
                            aisw.b = (ahbe)new agzb((agzi)aisw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aisw.a;
            }
            case 4: {
                return new agza((agzi)aisw.a);
            }
            case 3: {
                return new aisw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aisw.a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0004\u0002\u1409\u0005\u0003\u1409\u0000\u0005\u1409\u0003\u0007\u1409\u0001", new Object[] { "c", "g", "d", "f", "e" });
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
