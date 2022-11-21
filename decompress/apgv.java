import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgv extends ahcz implements aheo
{
    public static final apgv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private amiy i;
    private aisc j;
    private aibx k;
    private aibx l;
    private aisc m;
    private aibx n;
    private aphj o;
    private aibx p;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(apgv.class, a = new apgv());
    }
    
    private apgv() {
        this.r = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apgv.b) == null) {
                    synchronized (apgv.class) {
                        if (apgv.b == null) {
                            apgv.b = (ahev)new ahcs((ahcz)apgv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgv.a;
            }
            case 4: {
                return new ahcr((ahcz)apgv.a);
            }
            case 3: {
                return new apgv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgv.a, "\u0001\u000e\u0000\u0001\u0003\u0017\u000e\u0000\u0000\u000e\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\n\b\u1409\u0014\f\u1409\f\r\u1409\u000e\u000e\u1409\r\u000f\u1409\u0007\u0010\u1409\b\u0011\u1409\t\u0014\u1409\u0012\u0015\u1409\u0010\u0017\u1409\u000f", new Object[] { "c", "d", "e", "f", "j", "q", "k", "m", "l", "g", "h", "i", "p", "o", "n" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
