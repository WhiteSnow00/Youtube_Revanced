import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akql extends ahcz implements aheo
{
    public static final akql a;
    private static volatile ahev j;
    public int b;
    public aknh c;
    public String d;
    public int e;
    public String f;
    public boolean g;
    public akqn h;
    public akqr i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akql.class, a = new akql());
    }
    
    private akql() {
        this.k = 2;
        this.d = "";
        this.f = "";
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
                if ((j = akql.j) == null) {
                    synchronized (akql.class) {
                        if (akql.j == null) {
                            akql.j = (ahev)new ahcs((ahcz)akql.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akql.a;
            }
            case 4: {
                return new ahcr((ahcz)akql.a);
            }
            case 3: {
                return new akql();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akql.a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1008\u0003\u0010\u1009\t\u0011\u100c\u0002\u0012\u1009\n\u0013\u1007\u0004", new Object[] { "b", "c", "d", "f", "h", "e", ajse.s, "i", "g" });
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
