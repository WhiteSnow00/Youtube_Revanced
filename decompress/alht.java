import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alht extends ahcz implements aheo
{
    public static final alht a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public ahkc f;
    public int g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alht.class, a = new alht());
    }
    
    private alht() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alht.h) == null) {
                    synchronized (alht.class) {
                        if (alht.h == null) {
                            alht.h = (ahev)new ahcs((ahcz)alht.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alht.a;
            }
            case 4: {
                return new ahcr((ahcz)alht.a);
            }
            case 3: {
                return new alht();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alht.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1009\u0004\u0005\u1409\u0002\u0006\u1004\u0005", new Object[] { "b", "c", "e", "f", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
