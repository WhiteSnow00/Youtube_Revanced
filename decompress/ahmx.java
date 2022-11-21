import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmx extends ahcz implements aheo
{
    public static final ahmx a;
    private static volatile ahev c;
    public ahmz b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahmx.class, a = new ahmx());
    }
    
    private ahmx() {
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
                if ((c = ahmx.c) == null) {
                    synchronized (ahmx.class) {
                        if (ahmx.c == null) {
                            ahmx.c = (ahev)new ahcs((ahcz)ahmx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmx.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmx.a);
            }
            case 3: {
                return new ahmx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmx.a, "\u0001\u0001\u0000\u0001\uf8da\u25c5\uf8da\u25c5\u0001\u0000\u0000\u0001\uf8da\u25c5\u1409\u0000", new Object[] { "d", "b" });
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
