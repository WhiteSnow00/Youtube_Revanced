import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahif extends agzi implements ahax
{
    public static final ahif a;
    private static volatile ahbe b;
    private int c;
    private ahlm d;
    private ahjl e;
    private anss f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahif.class, a = new ahif());
    }
    
    private ahif() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = ahif.b) == null) {
                    synchronized (ahif.class) {
                        if (ahif.b == null) {
                            ahif.b = (ahbe)new agzb((agzi)ahif.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahif.a;
            }
            case 4: {
                return new agza((agzi)ahif.a);
            }
            case 3: {
                return new ahif();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahif.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0007\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
