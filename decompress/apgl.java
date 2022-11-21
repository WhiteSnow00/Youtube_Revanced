import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgl extends ahcz implements aheo
{
    public static final apgl a;
    private static volatile ahev f;
    public ajws b;
    public ajws c;
    public ahkb d;
    public long e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apgl.class, a = new apgl());
    }
    
    private apgl() {
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
                final ahev f;
                if ((f = apgl.f) == null) {
                    synchronized (apgl.class) {
                        if (apgl.f == null) {
                            apgl.f = (ahev)new ahcs((ahcz)apgl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apgl.a;
            }
            case 4: {
                return new ahcr((ahcz)apgl.a);
            }
            case 3: {
                return new apgl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgl.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1002\u0003\u0004\u1409\u0001\u0006\u1009\u0002", new Object[] { "g", "b", "e", "c", "d" });
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
