import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopm extends ahcz implements aheo
{
    public static final aopm a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aopm.class, a = new aopm());
    }
    
    private aopm() {
        this.b = 0;
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
                if ((d = aopm.d) == null) {
                    synchronized (aopm.class) {
                        if (aopm.d == null) {
                            aopm.d = (ahev)new ahcs((ahcz)aopm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aopm.a;
            }
            case 4: {
                return new ahcr((ahcz)aopm.a);
            }
            case 3: {
                return new aopm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopm.a, "\u0001\u0001\u0001\u0000\ued74\u2d12\ued74\u2d12\u0001\u0000\u0000\u0001\ued74\u2d12\u143c\u0000", new Object[] { "c", "b", aopp.class });
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
