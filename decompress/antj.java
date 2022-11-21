import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antj extends ahcz implements aheo
{
    public static final antj a;
    private static volatile ahev c;
    public anth b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(antj.class, a = new antj());
    }
    
    private antj() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = antj.c) == null) {
                    synchronized (antj.class) {
                        if (antj.c == null) {
                            antj.c = (ahev)new ahcs((ahcz)antj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return antj.a;
            }
            case 4: {
                return new ahcr((ahcz)antj.a);
            }
            case 3: {
                return new antj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antj.a, "\u0001\u0001\u0000\u0001\uf76c\u1f42\uf76c\u1f42\u0001\u0000\u0000\u0001\uf76c\u1f42\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
