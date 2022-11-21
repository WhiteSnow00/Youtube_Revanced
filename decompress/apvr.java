import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvr extends ahcz implements aheo
{
    public static final apvr a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private aisc k;
    private anxb l;
    private apvq m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(apvr.class, a = new apvr());
    }
    
    private apvr() {
        this.o = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apvr.b) == null) {
                    synchronized (apvr.class) {
                        if (apvr.b == null) {
                            apvr.b = (ahev)new ahcs((ahcz)apvr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvr.a;
            }
            case 4: {
                return new ahcr((ahcz)apvr.a);
            }
            case 3: {
                return new apvr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvr.a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\b\b\u1409\n\n\u1409\u000e\u000b\u1409\u0006\f\u1409\t\r\u1409\u0000\u000f\u1409\u000b", new Object[] { "c", "e", "f", "g", "h", "j", "l", "n", "i", "k", "d", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
