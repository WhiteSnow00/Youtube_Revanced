import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohi extends ahcz implements aheo
{
    public static final aohi a;
    private static volatile ahev d;
    public int b;
    public apop c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aohi.class, a = new aohi());
    }
    
    private aohi() {
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
                if ((d = aohi.d) == null) {
                    synchronized (aohi.class) {
                        if (aohi.d == null) {
                            aohi.d = (ahev)new ahcs((ahcz)aohi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aohi.a;
            }
            case 4: {
                return new ahcr((ahcz)aohi.a);
            }
            case 3: {
                return new aohi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
