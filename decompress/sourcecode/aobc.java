import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobc extends agzi implements ahax
{
    public static final aobc a;
    private static volatile ahbe d;
    public int b;
    public aobf c;
    private ahyj e;
    private amfl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aobc.class, a = new aobc());
    }
    
    private aobc() {
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
                final ahbe d;
                if ((d = aobc.d) == null) {
                    synchronized (aobc.class) {
                        if (aobc.d == null) {
                            aobc.d = (ahbe)new agzb((agzi)aobc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aobc.a;
            }
            case 4: {
                return new agza((agzi)aobc.a);
            }
            case 3: {
                return new aobc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobc.a, "\u0001\u0003\u0000\u0001\uffc6\u1847\ue496\u3d35\u0003\u0000\u0000\u0003\uffc6\u1847\u1409\u0001\uf79d\u2b18\u1409\u0000\ue496\u3d35\u1409\u0003", new Object[] { "b", "e", "c", "f" });
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
