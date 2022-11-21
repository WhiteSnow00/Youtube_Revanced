import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgn extends ahcz implements aheo
{
    public static final apgn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apgn.class, a = new apgn());
    }
    
    private apgn() {
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
                final ahev b;
                if ((b = apgn.b) == null) {
                    synchronized (apgn.class) {
                        if (apgn.b == null) {
                            apgn.b = (ahev)new ahcs((ahcz)apgn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgn.a;
            }
            case 4: {
                return new ahcr((ahcz)apgn.a);
            }
            case 3: {
                return new apgn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgn.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0006\u0004\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0002\u0007\u1409\u0003", new Object[] { "c", "h", "d", "g", "e", "f" });
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
