import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amgl extends agzi implements ahax
{
    public static final amgl a;
    private static volatile ahbe d;
    public int b;
    public amgk c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amgl.class, (agzi)(a = new amgl()));
    }
    
    private amgl() {
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
                if ((d = amgl.d) == null) {
                    synchronized (amgl.class) {
                        if (amgl.d == null) {
                            amgl.d = (ahbe)new agzb((agzi)amgl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amgl.a;
            }
            case 4: {
                return new agza((agzi)amgl.a);
            }
            case 3: {
                return new amgl();
            }
            case 2: {
                return newMessageInfo((MessageLite)amgl.a, "\u0001\u0001\u0000\u0001\uf237\u4161\uf237\u4161\u0001\u0000\u0000\u0001\uf237\u4161\u1409\u0000", new Object[] { "b", "c" });
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
