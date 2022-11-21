import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apti extends ahcz implements aheo
{
    public static final apti a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apti.class, a = new apti());
    }
    
    private apti() {
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
                if ((d = apti.d) == null) {
                    synchronized (apti.class) {
                        if (apti.d == null) {
                            apti.d = (ahev)new ahcs((ahcz)apti.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apti.a;
            }
            case 4: {
                return new ahcr((ahcz)apti.a);
            }
            case 3: {
                return new apti();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apti.a, "\u0001\u0003\u0001\u0000\ue113\u3a90\uf492\u4933\u0003\u0000\u0000\u0003\ue113\u3a90\u143c\u0000\uffdb\u3e3c\u143c\u0000\uf492\u4933\u143c\u0000", new Object[] { "c", "b", aptr.class, aoms.class, ajon.class });
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
