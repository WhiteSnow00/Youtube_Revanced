import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhs extends agzi implements ahax
{
    public static final amhs a;
    private static volatile ahbe d;
    public int b;
    public amhq c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amhs.class, (agzi)(a = new amhs()));
    }
    
    private amhs() {
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
                if ((d = amhs.d) == null) {
                    synchronized (amhs.class) {
                        if (amhs.d == null) {
                            amhs.d = (ahbe)new agzb((agzi)amhs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhs.a;
            }
            case 4: {
                return new agza((agzi)amhs.a);
            }
            case 3: {
                return new amhs();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhs.a, "\u0001\u0001\u0000\u0001\uf7b0\u43e2\uf7b0\u43e2\u0001\u0000\u0000\u0001\uf7b0\u43e2\u1409\u0000", new Object[] { "b", "c" });
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
