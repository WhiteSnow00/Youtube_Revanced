import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antc extends ahcz implements aheo
{
    public static final antc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(antc.class, a = new antc());
    }
    
    private antc() {
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
                if ((d = antc.d) == null) {
                    synchronized (antc.class) {
                        if (antc.d == null) {
                            antc.d = (ahev)new ahcs((ahcz)antc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return antc.a;
            }
            case 4: {
                return new ahcr((ahcz)antc.a);
            }
            case 3: {
                return new antc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antc.a, "\u0001\u0004\u0001\u0000\uecb1\u251b\uedcc\u341a\u0004\u0000\u0000\u0003\uecb1\u251b\u143c\u0000\uecb4\u251b\u143c\u0000\uf2b9\u3027\u143c\u0000\uedcc\u341a\u103c\u0000", new Object[] { "c", "b", ahvm.class, allv.class, ahzz.class, allo.class });
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
