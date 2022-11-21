import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnn extends ahcz implements aheo
{
    public static final amnn a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnn.class, a = new amnn());
    }
    
    private amnn() {
        this.b = 0;
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
                final ahev d;
                if ((d = amnn.d) == null) {
                    synchronized (amnn.class) {
                        if (amnn.d == null) {
                            amnn.d = (ahev)new ahcs((ahcz)amnn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnn.a;
            }
            case 4: {
                return new ahcr((ahcz)amnn.a);
            }
            case 3: {
                return new amnn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnn.a, "\u0001\u0007\u0001\u0000\ue592\u1be6\ue0c3\ud525\u0007\u0000\u0000\u0007\ue592\u1be6\u143c\u0000\ufc15\u1e98\u143c\u0000\ued6a\u25bb\u143c\u0000\ueb6b\u2cf9\u143c\u0000\uf492\u4933\u143c\u0000\ue05a\u4c64\u143c\u0000\ue0c3\ud525\u143c\u0000", new Object[] { "c", "b", amjl.class, aock.class, aixb.class, aiad.class, ajon.class, aoxn.class, alpl.class });
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
