import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnm extends ahcz implements aheo
{
    public static final amnm a;
    private static volatile ahev h;
    public int b;
    public amnr c;
    public amnk d;
    public ahdp e;
    public amnj f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amnm.class, a = new amnm());
    }
    
    private amnm() {
        this.j = 2;
        this.e = ahcz.emptyProtobufList();
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = amnm.h) == null) {
                    synchronized (amnm.class) {
                        if (amnm.h == null) {
                            amnm.h = (ahev)new ahcs((ahcz)amnm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amnm.a;
            }
            case 4: {
                return new ahcr((ahcz)amnm.a);
            }
            case 3: {
                return new amnm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnm.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001\u1409\u0001\u0002\u041b\u0003\u1409\u0005\u0004\u100a\u0006\u0005\u1409\u0002\u0006\u1409\u0000", new Object[] { "b", "d", "e", amnp.class, "i", "g", "f", "c" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
