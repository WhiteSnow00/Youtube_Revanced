import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amux extends agzi implements ahax
{
    public static final amux a;
    private static volatile ahbe c;
    public ajsh b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(amux.class, a = new amux());
    }
    
    private amux() {
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
                if ((c = amux.c) == null) {
                    synchronized (amux.class) {
                        if (amux.c == null) {
                            amux.c = (ahbe)new agzb((agzi)amux.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amux.a;
            }
            case 4: {
                return new agza((agzi)amux.a);
            }
            case 3: {
                return new amux();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amux.a, "\u0001\u0001\u0000\u0001\ue086\u2b84\ue086\u2b84\u0001\u0000\u0000\u0001\ue086\u2b84\u1409\u0000", new Object[] { "d", "b" });
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
