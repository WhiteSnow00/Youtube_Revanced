import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivh extends agzi implements ahax
{
    public static final aivh a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ahfw g;
    private anss h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aivh.class, a = new aivh());
    }
    
    private aivh() {
        this.i = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyIntList();
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
                if ((b2 = aivh.b) == null) {
                    synchronized (aivh.class) {
                        if (aivh.b == null) {
                            aivh.b = (ahbe)new agzb((agzi)aivh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivh.a;
            }
            case 4: {
                return new agza((agzi)aivh.a);
            }
            case 3: {
                return new aivh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivh.a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\n\u1409\b\f\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h" });
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
