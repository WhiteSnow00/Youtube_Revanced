import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amst extends agzi implements ahax
{
    public static final amst a;
    private static volatile ahbe c;
    public amss b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amst.class, a = new amst());
    }
    
    private amst() {
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
                final ahbe c;
                if ((c = amst.c) == null) {
                    synchronized (amst.class) {
                        if (amst.c == null) {
                            amst.c = (ahbe)new agzb((agzi)amst.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amst.a;
            }
            case 4: {
                return new agza((agzi)amst.a);
            }
            case 3: {
                return new amst();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amst.a, "\u0001\u0001\u0000\u0001\ue4f2\u23d5\ue4f2\u23d5\u0001\u0000\u0000\u0001\ue4f2\u23d5\u1409\u0000", new Object[] { "d", "b" });
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
