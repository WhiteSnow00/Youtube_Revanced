import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgr extends ahcz implements aheo
{
    public static final apgr a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aiet g;
    private aiet h;
    private aiet i;
    private aiet j;
    private aisc k;
    private aisc l;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(apgr.class, a = new apgr());
    }
    
    private apgr() {
        this.n = 2;
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
                if ((b = apgr.b) == null) {
                    synchronized (apgr.class) {
                        if (apgr.b == null) {
                            apgr.b = (ahev)new ahcs((ahcz)apgr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgr.a;
            }
            case 4: {
                return new ahcr((ahcz)apgr.a);
            }
            case 3: {
                return new apgr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgr.a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u000b\t\u1409\r\u000b\u1409\u0007\r\u1409\t\u000e\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "l", "m", "i", "k", "j" });
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
