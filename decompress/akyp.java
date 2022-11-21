import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyp extends ahcz implements aheo
{
    public static final akyp a;
    private static volatile ahev c;
    public ahyc b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyp.class, a = new akyp());
    }
    
    private akyp() {
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
                final ahev c;
                if ((c = akyp.c) == null) {
                    synchronized (akyp.class) {
                        if (akyp.c == null) {
                            akyp.c = (ahev)new ahcs((ahcz)akyp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akyp.a;
            }
            case 4: {
                return new ahcr((ahcz)akyp.a);
            }
            case 3: {
                return new akyp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyp.a, "\u0001\u0001\u0000\u0001\ue0c0\u2dd9\ue0c0\u2dd9\u0001\u0000\u0000\u0001\ue0c0\u2dd9\u1409\u0000", new Object[] { "d", "b" });
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
