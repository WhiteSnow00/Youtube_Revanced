import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdg extends ahcz implements aheo
{
    public static final apdg a;
    private static volatile ahev l;
    public int b;
    public aowb c;
    public aowb d;
    public apdf e;
    public ajws f;
    public ahdp g;
    public apzr h;
    public aiet i;
    public apdc j;
    public ahbt k;
    private ajws m;
    private ajws n;
    private ajws o;
    private ajws p;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(apdg.class, a = new apdg());
    }
    
    private apdg() {
        this.r = 2;
        this.g = ahcz.emptyProtobufList();
        this.k = ahbt.b;
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
                final ahev l;
                if ((l = apdg.l) == null) {
                    synchronized (apdg.class) {
                        if (apdg.l == null) {
                            apdg.l = (ahev)new ahcs((ahcz)apdg.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apdg.a;
            }
            case 4: {
                return new ahcr((ahcz)apdg.a);
            }
            case 3: {
                return new apdg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdg.a, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\b\u0005\u1409\u0010\u0006\u100a\u0011\u0007\u1409\u0001\b\u1409\u0005\t\u1409\t\u000b\u041b\f\u1409\u0007\u000e\u1009\u0002\u000f\u1409\f\u0013\u1409\u0006", new Object[] { "b", "c", "m", "f", "i", "q", "k", "d", "n", "p", "g", ajws.class, "h", "e", "j", "o" });
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
