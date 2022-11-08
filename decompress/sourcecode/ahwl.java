import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwl extends agzi implements ahax
{
    public static final ahwl a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahwl.class, a = new ahwl());
    }
    
    private ahwl() {
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
                if ((d = ahwl.d) == null) {
                    synchronized (ahwl.class) {
                        if (ahwl.d == null) {
                            ahwl.d = (ahbe)new agzb((agzi)ahwl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahwl.a;
            }
            case 4: {
                return new agza((agzi)ahwl.a);
            }
            case 3: {
                return new ahwl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwl.a, "\u0001\u0003\u0001\u0000\ueb11\u1f11\uf2c2\ua4a8\u0003\u0000\u0000\u0003\ueb11\u1f11\u143c\u0000\ue5d8\u2622\u143c\u0000\uf2c2\ua4a8\u143c\u0000", new Object[] { "c", "b", aibb.class, aibk.class, aibg.class });
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
