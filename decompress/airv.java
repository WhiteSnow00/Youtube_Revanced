import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airv extends ahcz implements aheo
{
    public static final airv a;
    private static volatile ahev j;
    public int b;
    public anxb c;
    public String d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(airv.class, a = new airv());
    }
    
    private airv() {
        this.k = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = airv.j) == null) {
                    synchronized (airv.class) {
                        if (airv.j == null) {
                            airv.j = (ahev)new ahcs((ahcz)airv.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return airv.a;
            }
            case 4: {
                return new ahcr((ahcz)airv.a);
            }
            case 3: {
                return new airv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airv.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
