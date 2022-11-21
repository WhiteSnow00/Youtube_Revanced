import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqj extends ahcz implements aheo
{
    public static final aoqj a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private anxb h;
    private aisc i;
    private aisc j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aoqj.class, a = new aoqj());
    }
    
    private aoqj() {
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
                if ((b = aoqj.b) == null) {
                    synchronized (aoqj.class) {
                        if (aoqj.b == null) {
                            aoqj.b = (ahev)new ahcs((ahcz)aoqj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqj.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqj.a);
            }
            case 3: {
                return new aoqj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqj.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
