import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfq extends ahcz implements aheo
{
    public static final apfq a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apfq.class, a = new apfq());
    }
    
    private apfq() {
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
                if ((b = apfq.b) == null) {
                    synchronized (apfq.class) {
                        if (apfq.b == null) {
                            apfq.b = (ahev)new ahcs((ahcz)apfq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfq.a;
            }
            case 4: {
                return new ahcr((ahcz)apfq.a);
            }
            case 3: {
                return new apfq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfq.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0003\u0004\u1409\u0000", new Object[] { "c", "e", "d" });
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
