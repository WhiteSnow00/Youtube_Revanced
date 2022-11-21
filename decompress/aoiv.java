import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiv extends ahcz implements aheo
{
    public static final aoiv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoiv.class, a = new aoiv());
    }
    
    private aoiv() {
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
                if ((d = aoiv.d) == null) {
                    synchronized (aoiv.class) {
                        if (aoiv.d == null) {
                            aoiv.d = (ahev)new ahcs((ahcz)aoiv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoiv.a;
            }
            case 4: {
                return new ahcr((ahcz)aoiv.a);
            }
            case 3: {
                return new aoiv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoiv.a, "\u0001\u0001\u0001\u0000\uf26a\u2912\uf26a\u2912\u0001\u0000\u0000\u0001\uf26a\u2912\u143c\u0000", new Object[] { "c", "b", allh.class });
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
