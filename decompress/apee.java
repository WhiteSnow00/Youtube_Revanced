import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apee extends ahcz implements aheo
{
    public static final apee a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aibx f;
    private aisc g;
    private amiy h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apee.class, a = new apee());
    }
    
    private apee() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apee.b) == null) {
                    synchronized (apee.class) {
                        if (apee.b == null) {
                            apee.b = (ahev)new ahcs((ahcz)apee.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apee.a;
            }
            case 4: {
                return new ahcr((ahcz)apee.a);
            }
            case 3: {
                return new apee();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apee.a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0007\b\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
