import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albu extends agzi implements ahax
{
    public static final albu a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)albu.class, (agzi)(a = new albu()));
    }
    
    private albu() {
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
                if ((d = albu.d) == null) {
                    synchronized (albu.class) {
                        if (albu.d == null) {
                            albu.d = (ahbe)new agzb((agzi)albu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albu.a;
            }
            case 4: {
                return new agza((agzi)albu.a);
            }
            case 3: {
                return new albu();
            }
            case 2: {
                return newMessageInfo((MessageLite)albu.a, "\u0001\u0002\u0001\u0000\uf3e6\u1e05\ue823\u259d\u0002\u0000\u0000\u0002\uf3e6\u1e05\u143c\u0000\ue823\u259d\u143c\u0000", new Object[] { "c", "b", ahkl.class, aneh.class });
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
