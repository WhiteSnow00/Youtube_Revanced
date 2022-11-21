import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amid extends ahcz implements aheo
{
    public static final amid a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private anxb g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(amid.class, a = new amid());
    }
    
    private amid() {
        this.l = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amid.b) == null) {
                    synchronized (amid.class) {
                        if (amid.b == null) {
                            amid.b = (ahev)new ahcs((ahcz)amid.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amid.a;
            }
            case 4: {
                return new ahcr((ahcz)amid.a);
            }
            case 3: {
                return new amid();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amid.a, "\u0001\b\u0000\u0001\u0002\n\b\u0000\u0000\b\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
