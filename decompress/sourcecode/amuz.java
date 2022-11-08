import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuz extends agzi implements ahax
{
    public static final amuz a;
    private static volatile ahbe b;
    private int c;
    private amvb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amuz.class, a = new amuz());
    }
    
    private amuz() {
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
                if ((b2 = amuz.b) == null) {
                    synchronized (amuz.class) {
                        if (amuz.b == null) {
                            amuz.b = (ahbe)new agzb((agzi)amuz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amuz.a;
            }
            case 4: {
                return new agza((agzi)amuz.a);
            }
            case 3: {
                return new amuz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuz.a, "\u0001\u0001\u0000\u0001\uf89b\uc3d0\uf89b\uc3d0\u0001\u0000\u0000\u0001\uf89b\uc3d0\u1409\u0001", new Object[] { "c", "d" });
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
