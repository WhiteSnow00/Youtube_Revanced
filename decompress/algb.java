import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algb extends ahcz implements aheo
{
    public static final algb a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algb.class, a = new algb());
    }
    
    private algb() {
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
                if ((d = algb.d) == null) {
                    synchronized (algb.class) {
                        if (algb.d == null) {
                            algb.d = (ahev)new ahcs((ahcz)algb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algb.a;
            }
            case 4: {
                return new ahcr((ahcz)algb.a);
            }
            case 3: {
                return new algb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algb.a, "\u0001\u0001\u0001\u0000\uf158\u1824\uf158\u1824\u0001\u0000\u0000\u0001\uf158\u1824\u143c\u0000", new Object[] { "c", "b", anli.class });
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
