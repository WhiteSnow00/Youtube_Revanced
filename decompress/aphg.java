import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphg extends ahcz implements aheo
{
    public static final aphg a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private ajws g;
    private ajws h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aphg.class, a = new aphg());
    }
    
    private aphg() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphg.b) == null) {
                    synchronized (aphg.class) {
                        if (aphg.b == null) {
                            aphg.b = (ahev)new ahcs((ahcz)aphg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphg.a;
            }
            case 4: {
                return new ahcr((ahcz)aphg.a);
            }
            case 3: {
                return new aphg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphg.a, "\u0001\u0006\u0000\u0001\u0002\r\u0006\u0000\u0000\u0006\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1409\u0006\b\u1409\u000b\u000b\u1409\u0007\r\u1409\b", new Object[] { "c", "d", "e", "f", "i", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
