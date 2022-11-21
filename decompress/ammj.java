import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammj extends ahcz implements aheo
{
    public static final ammj a;
    private static volatile ahev d;
    public int b;
    public ammi c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ammj.class, a = new ammj());
    }
    
    private ammj() {
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
                if ((d = ammj.d) == null) {
                    synchronized (ammj.class) {
                        if (ammj.d == null) {
                            ammj.d = (ahev)new ahcs((ahcz)ammj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammj.a;
            }
            case 4: {
                return new ahcr((ahcz)ammj.a);
            }
            case 3: {
                return new ammj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammj.a, "\u0001\u0001\u0000\u0001\uff27\u43ad\uff27\u43ad\u0001\u0000\u0000\u0001\uff27\u43ad\u1409\u0000", new Object[] { "b", "c" });
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
