import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzj extends ahcz implements aheo
{
    public static final alzj a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private amiy g;
    private ahjl h;
    private anxb i;
    private aiet j;
    private aiet k;
    private aisc l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(alzj.class, a = new alzj());
    }
    
    private alzj() {
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
                if ((b = alzj.b) == null) {
                    synchronized (alzj.class) {
                        if (alzj.b == null) {
                            alzj.b = (ahev)new ahcs((ahcz)alzj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alzj.a;
            }
            case 4: {
                return new ahcr((ahcz)alzj.a);
            }
            case 3: {
                return new alzj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzj.a, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\b\u0007\u1409\n\b\u1409\f\n\u1409\u000e\f\u1409\u000f\r\u1409\u0010\u000f\u1409\u0012", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
