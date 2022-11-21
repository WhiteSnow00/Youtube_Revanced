import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfd extends ahcz implements aheo
{
    public static final alfd a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alfd.class, a = new alfd());
    }
    
    private alfd() {
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
                if ((d = alfd.d) == null) {
                    synchronized (alfd.class) {
                        if (alfd.d == null) {
                            alfd.d = (ahev)new ahcs((ahcz)alfd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfd.a;
            }
            case 4: {
                return new ahcr((ahcz)alfd.a);
            }
            case 3: {
                return new alfd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfd.a, "\u0001\u0004\u0001\u0000\ue785\u2e13\ueb52\u9f6f\u0004\u0000\u0000\u0004\ue785\u2e13\u143c\u0000\ufa9b\u48a4\u143c\u0000\uf492\u4933\u143c\u0000\ueb52\u9f6f\u143c\u0000", new Object[] { "c", "b", apjb.class, alxg.class, ajon.class, apjj.class });
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
