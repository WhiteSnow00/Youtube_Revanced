import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcy extends agzi implements ahax
{
    public static final ajcy a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ajcy.class, a = new ajcy());
    }
    
    private ajcy() {
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
                if ((b2 = ajcy.b) == null) {
                    synchronized (ajcy.class) {
                        if (ajcy.b == null) {
                            ajcy.b = (ahbe)new agzb((agzi)ajcy.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajcy.a;
            }
            case 4: {
                return new agza((agzi)ajcy.a);
            }
            case 3: {
                return new ajcy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcy.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0007\u1409\u0000", new Object[] { "c", "e", "f", "g", "d" });
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
