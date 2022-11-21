import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphz extends ahcz implements aheo
{
    public static final aphz a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aphz.class, a = new aphz());
    }
    
    private aphz() {
        this.e = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aphz.b) == null) {
                    synchronized (aphz.class) {
                        if (aphz.b == null) {
                            aphz.b = (ahev)new ahcs((ahcz)aphz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphz.a;
            }
            case 4: {
                return new ahcr((ahcz)aphz.a);
            }
            case 3: {
                return new aphz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphz.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004\u1409\u0003", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
