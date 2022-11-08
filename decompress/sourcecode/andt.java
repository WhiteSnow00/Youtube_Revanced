import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andt extends agzi implements ahax
{
    public static final andt a;
    private static volatile ahbe b;
    private int c;
    private andu d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(andt.class, a = new andt());
    }
    
    private andt() {
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
                if ((b2 = andt.b) == null) {
                    synchronized (andt.class) {
                        if (andt.b == null) {
                            andt.b = (ahbe)new agzb((agzi)andt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return andt.a;
            }
            case 4: {
                return new agza((agzi)andt.a);
            }
            case 3: {
                return new andt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andt.a, "\u0001\u0001\u0000\u0001\uf0ac\ub1d9\uf0ac\ub1d9\u0001\u0000\u0000\u0001\uf0ac\ub1d9\u1409\u0000", new Object[] { "c", "d" });
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
