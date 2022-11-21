import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoix extends ahcz implements aheo
{
    public static final aoix a;
    private static volatile ahev d;
    public int b;
    public amhq c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoix.class, a = new aoix());
    }
    
    private aoix() {
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
                final ahev d;
                if ((d = aoix.d) == null) {
                    synchronized (aoix.class) {
                        if (aoix.d == null) {
                            aoix.d = (ahev)new ahcs((ahcz)aoix.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoix.a;
            }
            case 4: {
                return new ahcr((ahcz)aoix.a);
            }
            case 3: {
                return new aoix();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoix.a, "\u0001\u0001\u0000\u0001\uefcf\u2e35\uefcf\u2e35\u0001\u0000\u0000\u0001\uefcf\u2e35\u1409\u0000", new Object[] { "b", "c" });
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
