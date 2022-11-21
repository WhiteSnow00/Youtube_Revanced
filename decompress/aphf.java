import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphf extends ahcz implements aheo
{
    public static final aphf a;
    private static volatile ahev b;
    private int c;
    private aphg d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aphf.class, a = new aphf());
    }
    
    private aphf() {
        this.e = 2;
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
                if ((b = aphf.b) == null) {
                    synchronized (aphf.class) {
                        if (aphf.b == null) {
                            aphf.b = (ahev)new ahcs((ahcz)aphf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphf.a;
            }
            case 4: {
                return new ahcr((ahcz)aphf.a);
            }
            case 3: {
                return new aphf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphf.a, "\u0001\u0001\u0000\u0001\ufa35\u38b8\ufa35\u38b8\u0001\u0000\u0000\u0001\ufa35\u38b8\u1409\u0000", new Object[] { "c", "d" });
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
