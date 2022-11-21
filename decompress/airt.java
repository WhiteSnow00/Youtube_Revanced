import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airt extends ahcz implements aheo
{
    public static final airt a;
    private static volatile ahev i;
    public int b;
    public aowb c;
    public airu d;
    public airs e;
    public ahdp f;
    public ahbt g;
    public boolean h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(airt.class, a = new airt());
    }
    
    private airt() {
        this.k = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = ahbt.b;
        emptyProtobufList();
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
                if ((i = airt.i) == null) {
                    synchronized (airt.class) {
                        if (airt.i == null) {
                            airt.i = (ahev)new ahcs((ahcz)airt.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return airt.a;
            }
            case 4: {
                return new ahcr((ahcz)airt.a);
            }
            case 3: {
                return new airt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airt.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u001b\u0005\u1409\u0003\u0006\u100a\u0004\b\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", ahmu.class, "j", "g", "h" });
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
