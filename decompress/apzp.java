import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzp extends ahcz implements aheo
{
    public static final apzp a;
    private static volatile ahev d;
    public int b;
    public apzj c;
    private apzm e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apzp.class, a = new apzp());
    }
    
    private apzp() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apzp.d) == null) {
                    synchronized (apzp.class) {
                        if (apzp.d == null) {
                            apzp.d = (ahev)new ahcs((ahcz)apzp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzp.a;
            }
            case 4: {
                return new ahcr((ahcz)apzp.a);
            }
            case 3: {
                return new apzp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzp.a, "\u0001\u0002\u0000\u0001\uf99a\u1b1c\uf8f0\u1d85\u0002\u0000\u0000\u0002\uf99a\u1b1c\u1409\u0000\uf8f0\u1d85\u1409\u0001", new Object[] { "b", "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
