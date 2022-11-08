import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alao extends agzi implements ahax
{
    public static final alao a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)alao.class, (agzi)(a = new alao()));
    }
    
    private alao() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = alao.d) == null) {
                    synchronized (alao.class) {
                        if (alao.d == null) {
                            alao.d = (ahbe)new agzb((agzi)alao.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alao.a;
            }
            case 4: {
                return new agza((agzi)alao.a);
            }
            case 3: {
                return new alao();
            }
            case 2: {
                return newMessageInfo((MessageLite)alao.a, "\u0001\u0002\u0001\u0000\ue517\u1e94\ue5a3\u2883\u0002\u0000\u0000\u0001\ue517\u1e94\u143c\u0000\ue5a3\u2883\u103c\u0000", new Object[] { "c", "b", apfu.class, aiyk.class });
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
