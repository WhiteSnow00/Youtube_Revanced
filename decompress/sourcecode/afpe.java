import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpe extends agzi implements ahax
{
    public static final afpe a;
    private static volatile ahbe f;
    public int b;
    public long c;
    public int d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(afpe.class, a = new afpe());
    }
    
    private afpe() {
        this.g = 2;
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
                if ((f = afpe.f) == null) {
                    synchronized (afpe.class) {
                        if (afpe.f == null) {
                            afpe.f = (ahbe)new agzb((agzi)afpe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return afpe.a;
            }
            case 4: {
                return new agza((agzi)afpe.a);
            }
            case 3: {
                return new afpe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpe.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1502\u0000\u0002\u1506\u0001\u0003\u1506\u0002", new Object[] { "b", "c", "d", "e" });
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
