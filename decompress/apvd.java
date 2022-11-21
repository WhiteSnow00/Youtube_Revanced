import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvd extends ahcz implements aheo
{
    public static final apvd a;
    private static volatile ahev g;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public aiet f;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apvd.class, a = new apvd());
    }
    
    private apvd() {
        this.i = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apvd.g) == null) {
                    synchronized (apvd.class) {
                        if (apvd.g == null) {
                            apvd.g = (ahev)new ahcs((ahcz)apvd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apvd.a;
            }
            case 4: {
                return new ahcr((ahcz)apvd.a);
            }
            case 3: {
                return new apvd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvd.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
