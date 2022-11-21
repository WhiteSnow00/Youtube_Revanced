import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqm extends ahcz implements aheo
{
    public static final aoqm a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private anxb h;
    private ahjl i;
    private aisc j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aoqm.class, a = new aoqm());
    }
    
    private aoqm() {
        this.k = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = aoqm.b) == null) {
                    synchronized (aoqm.class) {
                        if (aoqm.b == null) {
                            aoqm.b = (ahev)new ahcs((ahcz)aoqm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqm.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqm.a);
            }
            case 3: {
                return new aoqm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqm.a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0003\t\u1409\b\u000b\u1409\u0004\f\u1409\n", new Object[] { "c", "d", "e", "f", "g", "i", "h", "j" });
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
