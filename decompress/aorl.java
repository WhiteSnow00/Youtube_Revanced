import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorl extends ahcz implements aheo
{
    public static final aorl a;
    private static volatile ahev d;
    public int b;
    public aorj c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aorl.class, a = new aorl());
    }
    
    private aorl() {
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
                if ((d = aorl.d) == null) {
                    synchronized (aorl.class) {
                        if (aorl.d == null) {
                            aorl.d = (ahev)new ahcs((ahcz)aorl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aorl.a;
            }
            case 4: {
                return new ahcr((ahcz)aorl.a);
            }
            case 3: {
                return new aorl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorl.a, "\u0001\u0001\u0000\u0001\ue661\u367b\ue661\u367b\u0001\u0000\u0000\u0001\ue661\u367b\u1409\u0000", new Object[] { "b", "c" });
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
