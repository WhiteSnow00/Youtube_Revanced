import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aism extends ahcz implements aheo
{
    public static final aism a;
    private static volatile ahev g;
    public int b;
    public aisn c;
    public aisk d;
    public aiso e;
    public aisp f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aism.class, a = new aism());
    }
    
    private aism() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aism.g) == null) {
                    synchronized (aism.class) {
                        if (aism.g == null) {
                            aism.g = (ahev)new ahcs((ahcz)aism.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aism.a;
            }
            case 4: {
                return new ahcr((ahcz)aism.a);
            }
            case 3: {
                return new aism();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aism.a, "\u0001\u0004\u0000\u0001\ue552\u3c3b\uedd0\u4cb9\u0004\u0000\u0000\u0004\ue552\u3c3b\u1409\u0000\ue2e7\u3ca9\u1409\u0001\uf68b\u4939\u1409\u0002\uedd0\u4cb9\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
