import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgq extends ahcz implements aheo
{
    public static final apgq a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private anxb i;
    private anxb j;
    private aisc k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apgq.class, a = new apgq());
    }
    
    private apgq() {
        this.m = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apgq.b) == null) {
                    synchronized (apgq.class) {
                        if (apgq.b == null) {
                            apgq.b = (ahev)new ahcs((ahcz)apgq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgq.a;
            }
            case 4: {
                return new ahcr((ahcz)apgq.a);
            }
            case 3: {
                return new apgq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgq.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\f\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
