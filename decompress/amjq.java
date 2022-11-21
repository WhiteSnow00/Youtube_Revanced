import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjq extends ahcz implements aheo
{
    public static final amjq a;
    private static volatile ahev d;
    public int b;
    public amjp c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amjq.class, a = new amjq());
    }
    
    private amjq() {
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
                if ((d = amjq.d) == null) {
                    synchronized (amjq.class) {
                        if (amjq.d == null) {
                            amjq.d = (ahev)new ahcs((ahcz)amjq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjq.a;
            }
            case 4: {
                return new ahcr((ahcz)amjq.a);
            }
            case 3: {
                return new amjq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjq.a, "\u0001\u0001\u0000\u0001\uecac\u3ac7\uecac\u3ac7\u0001\u0000\u0000\u0001\uecac\u3ac7\u1409\u0000", new Object[] { "b", "c" });
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
