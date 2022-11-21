import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alac extends ahcz implements aheo
{
    public static final alac a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alac.class, a = new alac());
    }
    
    private alac() {
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
                if ((d = alac.d) == null) {
                    synchronized (alac.class) {
                        if (alac.d == null) {
                            alac.d = (ahev)new ahcs((ahcz)alac.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alac.a;
            }
            case 4: {
                return new ahcr((ahcz)alac.a);
            }
            case 3: {
                return new alac();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alac.a, "\u0001\u0003\u0001\u0000\ue592\u1be6\uf492\u4933\u0003\u0000\u0000\u0003\ue592\u1be6\u143c\u0000\uf254\u2a6d\u143c\u0000\uf492\u4933\u143c\u0000", new Object[] { "c", "b", amjl.class, ahqm.class, ajon.class });
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
