import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphe extends ahcz implements aheo
{
    public static final aphe a;
    private static volatile ahev b;
    private int c;
    private aphf d;
    private aphf e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private aisc k;
    private anxb l;
    private ahjl m;
    private aphf n;
    private aphf o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(aphe.class, a = new aphe());
    }
    
    private aphe() {
        this.p = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphe.b) == null) {
                    synchronized (aphe.class) {
                        if (aphe.b == null) {
                            aphe.b = (ahev)new ahcs((ahcz)aphe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphe.a;
            }
            case 4: {
                return new ahcr((ahcz)aphe.a);
            }
            case 3: {
                return new aphe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphe.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\f\u0001\u1409\u000f\u0002\u1409\u0010\u0003\u1409\u0003\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\u000b\b\u1409\u000e\t\u1409\u0000\n\u1409\u0001\r\u1409\u0005\u000e\u1409\u0006\u0010\u1409\f", new Object[] { "c", "n", "o", "f", "i", "j", "k", "m", "d", "e", "g", "h", "l" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
