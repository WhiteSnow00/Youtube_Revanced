import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appo extends ahcz implements aheo
{
    public static final appo a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private aisc i;
    private ahof j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(appo.class, a = new appo());
    }
    
    private appo() {
        this.k = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = appo.b) == null) {
                    synchronized (appo.class) {
                        if (appo.b == null) {
                            appo.b = (ahev)new ahcs((ahcz)appo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appo.a;
            }
            case 4: {
                return new ahcr((ahcz)appo.a);
            }
            case 3: {
                return new appo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appo.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003\b\u1409\u0006\t\u1409\u0007\n\u1409\u0005", new Object[] { "c", "d", "e", "g", "f", "i", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
