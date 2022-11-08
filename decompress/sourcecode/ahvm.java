import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvm extends agzi implements ahax
{
    public static final ahvm a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahvm.class, a = new ahvm());
    }
    
    private ahvm() {
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
                if ((d = ahvm.d) == null) {
                    synchronized (ahvm.class) {
                        if (ahvm.d == null) {
                            ahvm.d = (ahbe)new agzb((agzi)ahvm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahvm.a;
            }
            case 4: {
                return new agza((agzi)ahvm.a);
            }
            case 3: {
                return new ahvm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahvm.a, "\u0001\b\u0001\u0000\uf143\u1824\ue659\ube12\b\u0000\u0000\b\uf143\u1824\u143c\u0000\ufa79\u1cc9\u143c\u0000\uf0d1\u2887\u143c\u0000\ufd6b\u2aea\u143c\u0000\ue0ae\u30fe\u143c\u0000\ufe1f\u353a\u143c\u0000\uf687\u3671\u143c\u0000\ue659\ube12\u143c\u0000", new Object[] { "c", "b", aiuh.class, ajxs.class, ahvl.class, amzs.class, amcb.class, ahvk.class, ahvq.class, ahvp.class });
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
