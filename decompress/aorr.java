import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorr extends ahcz implements aheo
{
    public static final aorr a;
    private static volatile ahev d;
    public int b;
    public aorq c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aorr.class, a = new aorr());
    }
    
    private aorr() {
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
                if ((d = aorr.d) == null) {
                    synchronized (aorr.class) {
                        if (aorr.d == null) {
                            aorr.d = (ahev)new ahcs((ahcz)aorr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aorr.a;
            }
            case 4: {
                return new ahcr((ahcz)aorr.a);
            }
            case 3: {
                return new aorr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aorr.a, "\u0001\u0001\u0000\u0001\ued68\u359c\ued68\u359c\u0001\u0000\u0000\u0001\ued68\u359c\u1409\u0000", new Object[] { "b", "c" });
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
