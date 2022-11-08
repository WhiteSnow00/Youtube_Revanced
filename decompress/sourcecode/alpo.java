import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpo extends agzi implements ahax
{
    public static final alpo a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public ajsq d;
    public ajsq e;
    public ahas f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(alpo.class, a = new alpo());
    }
    
    private alpo() {
        this.f = ahas.a;
        this.h = 2;
        this.c = "";
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
                final ahbe g;
                if ((g = alpo.g) == null) {
                    synchronized (alpo.class) {
                        if (alpo.g == null) {
                            alpo.g = (ahbe)new agzb((agzi)alpo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alpo.a;
            }
            case 4: {
                return new agza((agzi)alpo.a);
            }
            case 3: {
                return new alpo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpo.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u0432", new Object[] { "b", "c", "d", "e", "f", alpn.a });
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
