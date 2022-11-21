import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardx extends ahcz implements aheo
{
    public static final ardx a;
    private static volatile ahev i;
    public int b;
    public String c;
    public aree d;
    public ardw e;
    public String f;
    public aisc g;
    public float h;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(ardx.class, a = new ardx());
    }
    
    private ardx() {
        this.j = 2;
        this.c = "";
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = ardx.i) == null) {
                    synchronized (ardx.class) {
                        if (ardx.i == null) {
                            ardx.i = (ahev)new ahcs((ahcz)ardx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ardx.a;
            }
            case 4: {
                return new ahcr((ahcz)ardx.a);
            }
            case 3: {
                return new ardx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardx.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u1001\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
