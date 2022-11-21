import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgf extends ahcz implements aheo
{
    public static final apgf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private apge h;
    private ahjl i;
    private anxb j;
    private anxb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(apgf.class, a = new apgf());
    }
    
    private apgf() {
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
                if ((b = apgf.b) == null) {
                    synchronized (apgf.class) {
                        if (apgf.b == null) {
                            apgf.b = (ahev)new ahcs((ahcz)apgf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgf.a;
            }
            case 4: {
                return new ahcr((ahcz)apgf.a);
            }
            case 3: {
                return new apgf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgf.a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0007\u1409\u0004\n\u1409\t\u000b\u1409\n", new Object[] { "c", "d", "e", "f", "g", "i", "h", "j", "k" });
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
