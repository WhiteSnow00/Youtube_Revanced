import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apft extends ahcz implements aheo
{
    public static final apft a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private aiet l;
    private aiet m;
    private aiet n;
    private ajws o;
    private ajws p;
    private aiet q;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(apft.class, a = new apft());
    }
    
    private apft() {
        this.s = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apft.b) == null) {
                    synchronized (apft.class) {
                        if (apft.b == null) {
                            apft.b = (ahev)new ahcs((ahcz)apft.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apft.a;
            }
            case 4: {
                return new ahcr((ahcz)apft.a);
            }
            case 3: {
                return new apft();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apft.a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0000\u000f\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0010\t\u1409\u0005\n\u1409\u0006\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000e\u1409\n\u000f\u1409\u000b\u0010\u1409\f\u0011\u1409\r\u0012\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "r", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
