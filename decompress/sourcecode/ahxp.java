import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxp extends agzi implements ahax
{
    public static final ahxp a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public aorm d;
    public ajsq e;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahxp.class, a = new ahxp());
    }
    
    private ahxp() {
        this.h = 2;
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
                final ahbe f;
                if ((f = ahxp.f) == null) {
                    synchronized (ahxp.class) {
                        if (ahxp.f == null) {
                            ahxp.f = (ahbe)new agzb((agzi)ahxp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahxp.a;
            }
            case 4: {
                return new agza((agzi)ahxp.a);
            }
            case 3: {
                return new ahxp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
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
