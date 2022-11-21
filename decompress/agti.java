import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agti extends ahcz implements aheo
{
    public static final ahdi a;
    public static final agti b;
    private static volatile ahev j;
    public int c;
    public String d;
    public int e;
    public ahdh f;
    public agtc g;
    public agta h;
    public agtm i;
    private byte k;
    
    static {
        a = (ahdi)new pub(6);
        ahcz.registerDefaultInstance(agti.class, b = new agti());
    }
    
    private agti() {
        this.k = 2;
        this.d = "";
        this.f = ahcz.emptyIntList();
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
                if ((j = agti.j) == null) {
                    synchronized (agti.class) {
                        if (agti.j == null) {
                            agti.j = (ahev)new ahcs((ahcz)agti.b);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agti.b;
            }
            case 4: {
                return new ahcr((ahcz)agti.b);
            }
            case 3: {
                return new agti();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agti.b, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001e\u0005\u1009\u0002\n\u1009\u0007\u001c\u1009\u0019", new Object[] { "c", "d", "e", ahhs.i, "f", ahjh.a(), "g", "h", "i" });
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
