import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptn extends ahcz implements aheo
{
    public static final aptn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aptn.class, a = new aptn());
    }
    
    private aptn() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aptn.b) == null) {
                    synchronized (aptn.class) {
                        if (aptn.b == null) {
                            aptn.b = (ahev)new ahcs((ahcz)aptn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptn.a;
            }
            case 4: {
                return new ahcr((ahcz)aptn.a);
            }
            case 3: {
                return new aptn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptn.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
