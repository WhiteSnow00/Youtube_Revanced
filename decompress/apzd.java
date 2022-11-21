import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzd extends ahcz implements aheo
{
    public static final apzd a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private aisc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apzd.class, a = new apzd());
    }
    
    private apzd() {
        this.f = 2;
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = apzd.b) == null) {
                    synchronized (apzd.class) {
                        if (apzd.b == null) {
                            apzd.b = (ahev)new ahcs((ahcz)apzd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apzd.a;
            }
            case 4: {
                return new ahcr((ahcz)apzd.a);
            }
            case 3: {
                return new apzd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzd.a, "\u0001\u0002\u0000\u0001\u0003\u0007\u0002\u0000\u0000\u0002\u0003\u1409\u0004\u0007\u1409\u0005", new Object[] { "c", "d", "e" });
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
