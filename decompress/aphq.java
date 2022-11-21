import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphq extends ahcz implements aheo
{
    public static final aphq a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aiet h;
    private aiet i;
    private aisc j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aphq.class, a = new aphq());
    }
    
    private aphq() {
        this.l = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
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
                if ((b = aphq.b) == null) {
                    synchronized (aphq.class) {
                        if (aphq.b == null) {
                            aphq.b = (ahev)new ahcs((ahcz)aphq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphq.a;
            }
            case 4: {
                return new ahcr((ahcz)aphq.a);
            }
            case 3: {
                return new aphq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphq.a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\b\u1409\u000b\u000b\u1409\u0003\u000f\u1409\t", new Object[] { "c", "d", "f", "g", "h", "i", "k", "e", "j" });
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
