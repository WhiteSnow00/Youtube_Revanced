import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apec extends ahcz implements aheo
{
    public static final apec a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private aisc f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apec.class, a = new apec());
    }
    
    private apec() {
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
                if ((b = apec.b) == null) {
                    synchronized (apec.class) {
                        if (apec.b == null) {
                            apec.b = (ahev)new ahcs((ahcz)apec.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apec.a;
            }
            case 4: {
                return new ahcr((ahcz)apec.a);
            }
            case 3: {
                return new apec();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apec.a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0004\u1409\u0003\u0006\u1409\t\b\u1409\u0004\t\u1409\u0005", new Object[] { "c", "d", "e", "h", "f", "g" });
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
