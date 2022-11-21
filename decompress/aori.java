import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aori extends ahcz implements aheo
{
    public static final aori a;
    private static volatile ahev d;
    public int b;
    public aorh c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aori.class, a = new aori());
    }
    
    private aori() {
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
                if ((d = aori.d) == null) {
                    synchronized (aori.class) {
                        if (aori.d == null) {
                            aori.d = (ahev)new ahcs((ahcz)aori.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aori.a;
            }
            case 4: {
                return new ahcr((ahcz)aori.a);
            }
            case 3: {
                return new aori();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aori.a, "\u0001\u0001\u0000\u0001\ue545\u367b\ue545\u367b\u0001\u0000\u0000\u0001\ue545\u367b\u1409\u0000", new Object[] { "b", "c" });
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
