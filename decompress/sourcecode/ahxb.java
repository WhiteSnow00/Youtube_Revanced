import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxb extends agzi implements ahax
{
    public static final ahxb a;
    private static volatile ahbe d;
    public aorm b;
    public agyc c;
    private int e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahxb.class, a = new ahxb());
    }
    
    private ahxb() {
        this.h = 2;
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = ahxb.d) == null) {
                    synchronized (ahxb.class) {
                        if (ahxb.d == null) {
                            ahxb.d = (ahbe)new agzb((agzi)ahxb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahxb.a;
            }
            case 4: {
                return new agza((agzi)ahxb.a);
            }
            case 3: {
                return new ahxb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0004\u0003\u100a\u0005\u0004\u1409\u0002", new Object[] { "e", "b", "g", "c", "f" });
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
