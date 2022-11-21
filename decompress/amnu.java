import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnu extends ahcz implements aheo
{
    public static final amnu a;
    private static volatile ahev k;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ahbt g;
    public amnt h;
    public boolean i;
    public String j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(amnu.class, a = new amnu());
    }
    
    private amnu() {
        this.c = 0;
        this.e = 0;
        this.m = 2;
        this.g = ahbt.b;
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = amnu.k) == null) {
                    synchronized (amnu.class) {
                        if (amnu.k == null) {
                            amnu.k = (ahev)new ahcs((ahcz)amnu.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amnu.a;
            }
            case 4: {
                return new ahcr((ahcz)amnu.a);
            }
            case 3: {
                return new amnu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnu.a, "\u0001\t\u0002\u0001\u0001\r\t\u0000\u0000\u0006\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u143c\u0001\u0004\u143c\u0001\u0005\u1409\u0004\u0006\u100a\u0005\u000b\u1409\n\f\u1007\u000b\r\u1008\f", new Object[] { "d", "c", "f", "e", "b", akfj.class, aowb.class, amnq.class, aisc.class, "l", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
