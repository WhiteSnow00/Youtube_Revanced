import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhx extends agzi implements ahax
{
    public static final amhx a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhx.class, (agzi)(a = new amhx()));
    }
    
    private amhx() {
        this.b = 0;
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
                if ((d = amhx.d) == null) {
                    synchronized (amhx.class) {
                        if (amhx.d == null) {
                            amhx.d = (ahbe)new agzb((agzi)amhx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhx.a;
            }
            case 4: {
                return new agza((agzi)amhx.a);
            }
            case 3: {
                return new amhx();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhx.a, "\u0001\u0002\u0001\u0000\uf66d\u43e2\uf2ce\u4414\u0002\u0000\u0000\u0001\uf66d\u43e2\u143c\u0000\uf2ce\u4414\u103c\u0000", new Object[] { "c", "b", amht.class, apjv.class });
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
