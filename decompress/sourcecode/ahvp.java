import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvp extends agzi implements ahax
{
    public static final ahvp a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahvp.class, a = new ahvp());
    }
    
    private ahvp() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = ahvp.b) == null) {
                    synchronized (ahvp.class) {
                        if (ahvp.b == null) {
                            ahvp.b = (ahbe)new agzb((agzi)ahvp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahvp.a;
            }
            case 4: {
                return new agza((agzi)ahvp.a);
            }
            case 3: {
                return new ahvp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
