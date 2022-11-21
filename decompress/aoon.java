import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoon extends ahcz implements aheo
{
    public static final aoon a;
    private static volatile ahev b;
    private int c;
    private aopn d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoon.class, a = new aoon());
    }
    
    private aoon() {
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
                final ahev b;
                if ((b = aoon.b) == null) {
                    synchronized (aoon.class) {
                        if (aoon.b == null) {
                            aoon.b = (ahev)new ahcs((ahcz)aoon.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoon.a;
            }
            case 4: {
                return new ahcr((ahcz)aoon.a);
            }
            case 3: {
                return new aoon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoon.a, "\u0001\u0001\u0000\u0001\uff7e\u2d27\uff7e\u2d27\u0001\u0000\u0000\u0001\uff7e\u2d27\u1409\u0000", new Object[] { "c", "d" });
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
