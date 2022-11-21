import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgz extends ahcz implements aheo
{
    public static final apgz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private anxb h;
    private anxb i;
    private ajws j;
    private anxb k;
    private ajws l;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(apgz.class, a = new apgz());
    }
    
    private apgz() {
        this.n = 2;
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
                if ((b = apgz.b) == null) {
                    synchronized (apgz.class) {
                        if (apgz.b == null) {
                            apgz.b = (ahev)new ahcs((ahcz)apgz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgz.a;
            }
            case 4: {
                return new ahcr((ahcz)apgz.a);
            }
            case 3: {
                return new apgz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgz.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1409\n\u000b\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "l" });
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
