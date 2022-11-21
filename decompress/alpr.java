import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpr extends ahcz implements aheo
{
    public static final alpr a;
    private static volatile ahev e;
    public int b;
    public int c;
    public aisc d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alpr.class, a = new alpr());
    }
    
    private alpr() {
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
                if ((e = alpr.e) == null) {
                    synchronized (alpr.class) {
                        if (alpr.e == null) {
                            alpr.e = (ahev)new ahcs((ahcz)alpr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alpr.a;
            }
            case 4: {
                return new ahcr((ahcz)alpr.a);
            }
            case 3: {
                return new alpr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
