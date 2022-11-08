import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqd extends agzi implements ahax
{
    public static final alqd a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alqd.class, a = new alqd());
    }
    
    private alqd() {
        this.b = 0;
        this.e = 2;
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
                if ((d = alqd.d) == null) {
                    synchronized (alqd.class) {
                        if (alqd.d == null) {
                            alqd.d = (ahbe)new agzb((agzi)alqd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alqd.a;
            }
            case 4: {
                return new agza((agzi)alqd.a);
            }
            case 3: {
                return new alqd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqd.a, "\u0001\u0002\u0001\u0000\ue68a\u3d88\uf407\u5a86\u0002\u0000\u0000\u0002\ue68a\u3d88\u143c\u0000\uf407\u5a86\u143c\u0000", new Object[] { "c", "b", alno.class, alpq.class });
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
