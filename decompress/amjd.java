import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjd extends ahcz implements aheo
{
    public static final amjd a;
    private static volatile ahev l;
    public int b;
    public ajws c;
    public akfj d;
    public aisc e;
    public ajws f;
    public akfj g;
    public aisc h;
    public boolean i;
    public ahbt j;
    public String k;
    private ajws m;
    private ajws n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(amjd.class, a = new amjd());
    }
    
    private amjd() {
        this.p = 2;
        this.j = ahbt.b;
        this.k = "";
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
                if ((l = amjd.l) == null) {
                    synchronized (amjd.class) {
                        if (amjd.l == null) {
                            amjd.l = (ahev)new ahcs((ahcz)amjd.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return amjd.a;
            }
            case 4: {
                return new ahcr((ahcz)amjd.a);
            }
            case 3: {
                return new amjd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjd.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\n\b\u100a\u000b\u000b\u1007\b\f\u1409\u0001\r\u1409\u0005\u0010\u1008\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "o", "j", "i", "m", "n", "k" });
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
