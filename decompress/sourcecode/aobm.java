import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobm extends agzi implements ahax
{
    public static final aobm a;
    private static volatile ahbe m;
    public int b;
    public ajvj c;
    public ajxm d;
    public akah e;
    public aphw f;
    public aoay g;
    public aoax h;
    public akaj i;
    public amfe j;
    public apav k;
    public apcu l;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aobm.class, a = new aobm());
    }
    
    private aobm() {
        this.n = 2;
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
                final ahbe m;
                if ((m = aobm.m) == null) {
                    synchronized (aobm.class) {
                        if (aobm.m == null) {
                            aobm.m = (ahbe)new agzb((agzi)aobm.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aobm.a;
            }
            case 4: {
                return new agza((agzi)aobm.a);
            }
            case 3: {
                return new aobm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobm.a, "\u0001\n\u0000\u0001\ue7ec\u1886\ue675\u5339\n\u0000\u0000\n\ue7ec\u1886\u1409\u0002\ufd42\u18b3\u1409\u0001\uf2b9\u1a87\u1409\u0004\uf3e7\u1ba6\u1409\u0003\ue592\u1be6\u1409\u0007\uf859\u1c42\u1409\u0005\uf8a7\u1c42\u1409\u0006\ufbbc\u1f4f\u1409\u0000\uf36b\u38a8\u1409\t\ue675\u5339\u1409\b", new Object[] { "b", "e", "d", "g", "f", "j", "h", "i", "c", "l", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
