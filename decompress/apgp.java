import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgp extends ahcz implements aheo
{
    public static final apgp a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private aisc i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apgp.class, a = new apgp());
    }
    
    private apgp() {
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
                if ((b = apgp.b) == null) {
                    synchronized (apgp.class) {
                        if (apgp.b == null) {
                            apgp.b = (ahev)new ahcs((ahcz)apgp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgp.a;
            }
            case 4: {
                return new ahcr((ahcz)apgp.a);
            }
            case 3: {
                return new apgp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgp.a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0006\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\n\u000b\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
