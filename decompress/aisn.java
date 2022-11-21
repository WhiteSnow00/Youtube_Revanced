import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisn extends ahcz implements aheo
{
    public static final aisn a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aisn.class, a = new aisn());
    }
    
    private aisn() {
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
                if ((d = aisn.d) == null) {
                    synchronized (aisn.class) {
                        if (aisn.d == null) {
                            aisn.d = (ahev)new ahcs((ahcz)aisn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aisn.a;
            }
            case 4: {
                return new ahcr((ahcz)aisn.a);
            }
            case 3: {
                return new aisn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisn.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "b", "c" });
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
