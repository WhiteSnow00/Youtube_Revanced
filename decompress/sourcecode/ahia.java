import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahia extends agzi implements ahax
{
    public static final ahia a;
    private static volatile ahbe b;
    private int c;
    private ajys d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahia.class, a = new ahia());
    }
    
    private ahia() {
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
                final ahbe b2;
                if ((b2 = ahia.b) == null) {
                    synchronized (ahia.class) {
                        if (ahia.b == null) {
                            ahia.b = (ahbe)new agzb((agzi)ahia.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahia.a;
            }
            case 4: {
                return new agza((agzi)ahia.a);
            }
            case 3: {
                return new ahia();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahia.a, "\u0001\u0001\u0000\u0001\uf339\u2d68\uf339\u2d68\u0001\u0000\u0000\u0001\uf339\u2d68\u1409\u0000", new Object[] { "c", "d" });
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