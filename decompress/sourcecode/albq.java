import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albq extends agzi implements ahax
{
    public static final albq a;
    private static volatile ahbe d;
    public int b;
    public akjd c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)albq.class, (agzi)(a = new albq()));
    }
    
    private albq() {
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
                if ((d = albq.d) == null) {
                    synchronized (albq.class) {
                        if (albq.d == null) {
                            albq.d = (ahbe)new agzb((agzi)albq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albq.a;
            }
            case 4: {
                return new agza((agzi)albq.a);
            }
            case 3: {
                return new albq();
            }
            case 2: {
                return newMessageInfo((MessageLite)albq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
