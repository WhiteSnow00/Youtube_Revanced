import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albv extends agzi implements ahax
{
    public static final albv a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)albv.class, (agzi)(a = new albv()));
    }
    
    private albv() {
        this.f = 2;
    }
    
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
                if ((b2 = albv.b) == null) {
                    synchronized (albv.class) {
                        if (albv.b == null) {
                            albv.b = (ahbe)new agzb((agzi)albv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return albv.a;
            }
            case 4: {
                return new agza((agzi)albv.a);
            }
            case 3: {
                return new albv();
            }
            case 2: {
                return newMessageInfo((MessageLite)albv.a, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0002\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
