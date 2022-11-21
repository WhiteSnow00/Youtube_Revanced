import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfv extends ahcz implements aheo
{
    public static final apfv a;
    private static volatile ahev b;
    private int c;
    private apfs d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apfv.class, a = new apfv());
    }
    
    private apfv() {
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
                final ahev b;
                if ((b = apfv.b) == null) {
                    synchronized (apfv.class) {
                        if (apfv.b == null) {
                            apfv.b = (ahev)new ahcs((ahcz)apfv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfv.a;
            }
            case 4: {
                return new ahcr((ahcz)apfv.a);
            }
            case 3: {
                return new apfv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfv.a, "\u0001\u0001\u0000\u0001\uf706\u42f5\uf706\u42f5\u0001\u0000\u0000\u0001\uf706\u42f5\u1409\u0000", new Object[] { "c", "d" });
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
