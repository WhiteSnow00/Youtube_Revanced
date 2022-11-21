import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apff extends ahcz implements aheo
{
    public static final apff a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apff.class, a = new apff());
    }
    
    private apff() {
        this.h = 2;
        emptyProtobufList();
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
                if ((b = apff.b) == null) {
                    synchronized (apff.class) {
                        if (apff.b == null) {
                            apff.b = (ahev)new ahcs((ahcz)apff.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apff.a;
            }
            case 4: {
                return new ahcr((ahcz)apff.a);
            }
            case 3: {
                return new apff();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apff.a, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0000\u0004\u0004\u1409\u0003\u0006\u1409\u0006\b\u1409\b\t\u1409\u0004", new Object[] { "c", "d", "f", "g", "e" });
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
