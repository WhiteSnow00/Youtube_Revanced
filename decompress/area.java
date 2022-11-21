import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class area extends ahcz implements aheo
{
    public static final area a;
    private static volatile ahev g;
    public int b;
    public aive c;
    public int d;
    public int e;
    public ahhm f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(area.class, a = new area());
    }
    
    private area() {
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
                if ((g = area.g) == null) {
                    synchronized (area.class) {
                        if (area.g == null) {
                            area.g = (ahev)new ahcs((ahcz)area.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return area.a;
            }
            case 4: {
                return new ahcr((ahcz)area.a);
            }
            case 3: {
                return new area();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)area.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
