import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansa extends ahcz implements aheo
{
    public static final ansa a;
    private static volatile ahev j;
    public int b;
    public anrt c;
    public ahdp d;
    public anxb e;
    public ahof f;
    public ahbt g;
    public String h;
    public boolean i;
    private ahjl k;
    private anxb l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ansa.class, a = new ansa());
    }
    
    private ansa() {
        this.m = 2;
        this.d = ahcz.emptyProtobufList();
        this.g = ahbt.b;
        this.h = "";
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
                final ahev j;
                if ((j = ansa.j) == null) {
                    synchronized (ansa.class) {
                        if (ansa.j == null) {
                            ansa.j = (ahev)new ahcs((ahcz)ansa.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ansa.a;
            }
            case 4: {
                return new ahcr((ahcz)ansa.a);
            }
            case 3: {
                return new ansa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansa.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u001b\u0003\u1409\u0001\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0002\u0007\u1409\u0005\b\u1008\u0006\t\u1007\u0007", new Object[] { "b", "c", "d", anro.class, "e", "k", "g", "f", "l", "h", "i" });
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
