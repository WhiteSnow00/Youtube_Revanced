import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgk extends ahcz implements aheo
{
    public static final apgk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private aibx j;
    private aisc k;
    private ahjl l;
    private ajws m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(apgk.class, a = new apgk());
    }
    
    private apgk() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apgk.b) == null) {
                    synchronized (apgk.class) {
                        if (apgk.b == null) {
                            apgk.b = (ahev)new ahcs((ahcz)apgk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgk.a;
            }
            case 4: {
                return new ahcr((ahcz)apgk.a);
            }
            case 3: {
                return new apgk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgk.a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\t\u1409\b\n\u1409\t\u000e\u1409\r\u000f\u1409\u0004\u0010\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "i", "j", "k", "l", "h", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
