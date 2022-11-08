import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotn extends agzi implements ahax
{
    public static final aotn a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aotn.class, a = new aotn());
    }
    
    private aotn() {
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
                if ((b2 = aotn.b) == null) {
                    synchronized (aotn.class) {
                        if (aotn.b == null) {
                            aotn.b = (ahbe)new agzb((agzi)aotn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aotn.a;
            }
            case 4: {
                return new agza((agzi)aotn.a);
            }
            case 3: {
                return new aotn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotn.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
