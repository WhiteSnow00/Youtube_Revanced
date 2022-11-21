import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amio extends ahcz implements aheo
{
    public static final amio a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public akfj d;
    public aisc e;
    public ahbt f;
    public int g;
    public String h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(amio.class, a = new amio());
    }
    
    private amio() {
        this.k = 2;
        this.f = ahbt.b;
        this.h = "";
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
                final ahev i;
                if ((i = amio.i) == null) {
                    synchronized (amio.class) {
                        if (amio.i == null) {
                            amio.i = (ahev)new ahcs((ahcz)amio.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amio.a;
            }
            case 4: {
                return new ahcr((ahcz)amio.a);
            }
            case 3: {
                return new amio();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amio.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0007\u100c\u0006\n\u1008\b", new Object[] { "b", "c", "d", "e", "j", "f", "g", amgw.m, "h" });
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
