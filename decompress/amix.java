import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amix extends ahcz implements aheo
{
    public static final amix a;
    private static volatile ahev l;
    public int b;
    public ajws c;
    public akfj d;
    public aisc e;
    public aisc f;
    public ahbt g;
    public boolean h;
    public boolean i;
    public int j;
    public String k;
    private ajws m;
    private ajws n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(amix.class, a = new amix());
    }
    
    private amix() {
        this.p = 2;
        this.g = ahbt.b;
        this.k = "";
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = amix.l) == null) {
                    synchronized (amix.class) {
                        if (amix.l == null) {
                            amix.l = (ahev)new ahcs((ahcz)amix.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return amix.a;
            }
            case 4: {
                return new ahcr((ahcz)amix.a);
            }
            case 3: {
                return new amix();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amix.a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0006\u0005\u100a\u0007\t\u1409\u0002\n\u1409\u0005\f\u1007\n\u000e\u100c\r\u000f\u1008\u000e\u0010\u1007\f\u0012\u1409\u0001", new Object[] { "b", "c", "d", "e", "o", "g", "n", "f", "h", "j", amgw.l, "k", "i", "m" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
