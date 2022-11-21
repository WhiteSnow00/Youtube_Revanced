import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqq extends ahcz implements aheo
{
    public static final akqq a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akqq.class, a = new akqq());
    }
    
    private akqq() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = akqq.b) == null) {
                    synchronized (akqq.class) {
                        if (akqq.b == null) {
                            akqq.b = (ahev)new ahcs((ahcz)akqq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akqq.a;
            }
            case 4: {
                return new ahcr((ahcz)akqq.a);
            }
            case 3: {
                return new akqq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqq.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
