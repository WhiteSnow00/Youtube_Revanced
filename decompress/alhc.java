import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhc extends ahcz implements aheo
{
    public static final alhc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alhc.class, a = new alhc());
    }
    
    private alhc() {
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
                if ((d = alhc.d) == null) {
                    synchronized (alhc.class) {
                        if (alhc.d == null) {
                            alhc.d = (ahev)new ahcs((ahcz)alhc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alhc.a;
            }
            case 4: {
                return new ahcr((ahcz)alhc.a);
            }
            case 3: {
                return new alhc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhc.a, "\u0001\u0004\u0001\u0000\uf321\u1e90\uebde\u2e12\u0004\u0000\u0000\u0004\uf321\u1e90\u143c\u0000\uf437\u1f3b\u143c\u0000\ue3a1\u2d35\u143c\u0000\uebde\u2e12\u143c\u0000", new Object[] { "c", "b", aizd.class, aqal.class, aqam.class, amih.class });
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
