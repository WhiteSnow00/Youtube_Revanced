import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpj extends agzi implements ahax
{
    public static final ahpj a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahpj.class, a = new ahpj());
    }
    
    private ahpj() {
        this.e = 2;
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
                if ((b2 = ahpj.b) == null) {
                    synchronized (ahpj.class) {
                        if (ahpj.b == null) {
                            ahpj.b = (ahbe)new agzb((agzi)ahpj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpj.a;
            }
            case 4: {
                return new agza((agzi)ahpj.a);
            }
            case 3: {
                return new ahpj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpj.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
