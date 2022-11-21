import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apte extends ahcz implements aheo
{
    public static final apte a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apte.class, a = new apte());
    }
    
    private apte() {
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
                if ((d = apte.d) == null) {
                    synchronized (apte.class) {
                        if (apte.d == null) {
                            apte.d = (ahev)new ahcs((ahcz)apte.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apte.a;
            }
            case 4: {
                return new ahcr((ahcz)apte.a);
            }
            case 3: {
                return new apte();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apte.a, "\u0001\u0003\u0001\u0000\ufeaf\u4a23\ufa32\u53af\u0003\u0000\u0000\u0003\ufeaf\u4a23\u143c\u0000\ue14e\u4a25\u143c\u0000\ufa32\u53af\u143c\u0000", new Object[] { "c", "b", aptg.class, aptd.class, apta.class });
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
