import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akbt extends ahcz implements aheo
{
    public static final akbt a;
    private static volatile ahev m;
    public int b;
    public ajws c;
    public aoji d;
    public ahdp e;
    public aisc f;
    public ajws g;
    public ajws h;
    public aich i;
    public amiy j;
    public alzu k;
    public ahbt l;
    private aisc n;
    private aich o;
    private anxb p;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(akbt.class, a = new akbt());
    }
    
    private akbt() {
        this.r = 2;
        this.e = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.l = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = akbt.m) == null) {
                    synchronized (akbt.class) {
                        if (akbt.m == null) {
                            akbt.m = (ahev)new ahcs((ahcz)akbt.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akbt.a;
            }
            case 4: {
                return new ahcr((ahcz)akbt.a);
            }
            case 3: {
                return new akbt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akbt.a, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\t\t\u1409\u000b\n\u100a\f\u000b\u041b\r\u1409\u0003\u000e\u1409\b\u000f\u1409\u0006\u0012\u1009\n", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "q", "l", "e", aovp.class, "n", "p", "o", "k" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
