import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpu extends agzi implements ahax
{
    public static final alpu a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alpu.class, a = new alpu());
    }
    
    private alpu() {
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
                if ((d = alpu.d) == null) {
                    synchronized (alpu.class) {
                        if (alpu.d == null) {
                            alpu.d = (ahbe)new agzb((agzi)alpu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpu.a;
            }
            case 4: {
                return new agza((agzi)alpu.a);
            }
            case 3: {
                return new alpu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpu.a, "\u0001\u0003\u0001\u0000\ue592\u1be6\ue4ee\u3f2e\u0003\u0000\u0000\u0003\ue592\u1be6\u143c\u0000\ue0bd\u39da\u143c\u0000\ue4ee\u3f2e\u143c\u0000", new Object[] { "c", "b", amfe.class, aloz.class, alqc.class });
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
