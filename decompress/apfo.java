import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfo extends ahcz implements aheo
{
    public static final apfo a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apfo.class, a = new apfo());
    }
    
    private apfo() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfo.b) == null) {
                    synchronized (apfo.class) {
                        if (apfo.b == null) {
                            apfo.b = (ahev)new ahcs((ahcz)apfo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfo.a;
            }
            case 4: {
                return new ahcr((ahcz)apfo.a);
            }
            case 3: {
                return new apfo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfo.a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0004\u1409\u0004\u0006\u1409\u0006", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
