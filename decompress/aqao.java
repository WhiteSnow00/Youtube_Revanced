import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqao extends ahcz implements aheo
{
    public static final aqao a;
    private static volatile ahev e;
    public ajws b;
    public ajws c;
    public ajws d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqao.class, a = new aqao());
    }
    
    private aqao() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqao.e) == null) {
                    synchronized (aqao.class) {
                        if (aqao.e == null) {
                            aqao.e = (ahev)new ahcs((ahcz)aqao.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqao.a;
            }
            case 4: {
                return new ahcr((ahcz)aqao.a);
            }
            case 3: {
                return new aqao();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqao.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
