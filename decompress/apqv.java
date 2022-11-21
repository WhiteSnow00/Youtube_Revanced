import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqv extends ahcz implements aheo
{
    public static final apqv a;
    private static volatile ahev b;
    private int c;
    private apqx d;
    private ajws e;
    private ajws f;
    private aqgs g;
    private apqw h;
    private apqy i;
    private ajws j;
    private ajws k;
    private aisc l;
    private aisc m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(apqv.class, a = new apqv());
    }
    
    private apqv() {
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
                if ((b = apqv.b) == null) {
                    synchronized (apqv.class) {
                        if (apqv.b == null) {
                            apqv.b = (ahev)new ahcs((ahcz)apqv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqv.a;
            }
            case 4: {
                return new ahcr((ahcz)apqv.a);
            }
            case 3: {
                return new apqv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqv.a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\r\f\u1409\n\u000e\u1409\u000b\u000f\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "n", "l", "m", "g" });
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
