import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvu extends agzi implements ahax
{
    public static final amvu a;
    private static volatile ahbe g;
    public int b;
    public amvv c;
    public amvx d;
    public amvw e;
    public amvz f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(amvu.class, a = new amvu());
    }
    
    private amvu() {
        this.h = 2;
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
                final ahbe g;
                if ((g = amvu.g) == null) {
                    synchronized (amvu.class) {
                        if (amvu.g == null) {
                            amvu.g = (ahbe)new agzb((agzi)amvu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amvu.a;
            }
            case 4: {
                return new agza((agzi)amvu.a);
            }
            case 3: {
                return new amvu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvu.a, "\u0001\u0004\u0000\u0001\uf067\u2502\ueec5\u34f7\u0004\u0000\u0000\u0004\uf067\u2502\u1409\u0001\ue621\u250c\u1409\u0000\ueaae\u2522\u1409\u0003\ueec5\u34f7\u1409\u0002", new Object[] { "b", "d", "c", "f", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
