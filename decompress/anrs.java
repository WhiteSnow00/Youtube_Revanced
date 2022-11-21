import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrs extends ahcz implements aheo
{
    public static final anrs a;
    private static volatile ahev x;
    public int b;
    public aowb c;
    public anxb d;
    public akfj e;
    public ajws f;
    public ajws g;
    public ajws h;
    public anxb i;
    public anxb j;
    public long k;
    public boolean l;
    public ajws m;
    public aisc n;
    public ahdp o;
    public anxb p;
    public long q;
    public aidv r;
    public ahdp s;
    public boolean t;
    public anrh u;
    public anrr v;
    public boolean w;
    private byte y;
    
    static {
        ahcz.registerDefaultInstance(anrs.class, a = new anrs());
    }
    
    private anrs() {
        this.y = 2;
        this.o = ahcz.emptyProtobufList();
        this.s = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev x;
                if ((x = anrs.x) == null) {
                    synchronized (anrs.class) {
                        if (anrs.x == null) {
                            anrs.x = (ahev)new ahcs((ahcz)anrs.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return anrs.a;
            }
            case 4: {
                return new ahcr((ahcz)anrs.a);
            }
            case 3: {
                return new anrs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrs.a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0002\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\n\b\u1409\u000b\t\u041b\n\u1409\f\u000b\u1002\r\f\u1009\u000e\r\u041b\u000e\u1007\u000f\u000f\u1409\u0006\u0011\u1009\u0011\u0012\u1009\u0012\u0014\u1007\u0014\u0016\u1409\u0007\u0017\u1002\b\u0018\u1007\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "m", "n", "o", aisc.class, "p", "q", "r", "s", aisc.class, "t", "i", "u", "v", "w", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
