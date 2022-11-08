import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alah extends agzi implements ahax
{
    public static final alah a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)alah.class, (agzi)(a = new alah()));
    }
    
    private alah() {
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
                if ((d = alah.d) == null) {
                    synchronized (alah.class) {
                        if (alah.d == null) {
                            alah.d = (ahbe)new agzb((agzi)alah.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alah.a;
            }
            case 4: {
                return new agza((agzi)alah.a);
            }
            case 3: {
                return new alah();
            }
            case 2: {
                return newMessageInfo((MessageLite)alah.a, "\u0001\u0001\u0001\u0000\ue517\u1e94\ue517\u1e94\u0001\u0000\u0000\u0001\ue517\u1e94\u143c\u0000", new Object[] { "c", "b", apfu.class });
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
