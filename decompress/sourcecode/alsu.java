import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsu extends agzi implements ahax
{
    public static final alsu a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private aioe f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(alsu.class, a = new alsu());
    }
    
    private alsu() {
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
                final ahbe b2;
                if ((b2 = alsu.b) == null) {
                    synchronized (alsu.class) {
                        if (alsu.b == null) {
                            alsu.b = (ahbe)new agzb((agzi)alsu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alsu.a;
            }
            case 4: {
                return new agza((agzi)alsu.a);
            }
            case 3: {
                return new alsu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsu.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
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
