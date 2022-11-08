import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albb extends agzi implements ahax
{
    public static final albb a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)albb.class, (agzi)(a = new albb()));
    }
    
    private albb() {
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
                if ((d = albb.d) == null) {
                    synchronized (albb.class) {
                        if (albb.d == null) {
                            albb.d = (ahbe)new agzb((agzi)albb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albb.a;
            }
            case 4: {
                return new agza((agzi)albb.a);
            }
            case 3: {
                return new albb();
            }
            case 2: {
                return newMessageInfo((MessageLite)albb.a, "\u0001\u0001\u0001\u0000\ue517\u1e94\ue517\u1e94\u0001\u0000\u0000\u0001\ue517\u1e94\u143c\u0000", new Object[] { "c", "b", apfu.class });
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
