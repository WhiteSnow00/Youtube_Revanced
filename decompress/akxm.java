import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxm extends ahcz implements aheo
{
    public static final akxm a;
    private static volatile ahev e;
    public aknj b;
    public ahdp c;
    public long d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxm.class, a = new akxm());
    }
    
    private akxm() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akxm.e) == null) {
                    synchronized (akxm.class) {
                        if (akxm.e == null) {
                            akxm.e = (ahev)new ahcs((ahcz)akxm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akxm.a;
            }
            case 4: {
                return new ahcr((ahcz)akxm.a);
            }
            case 3: {
                return new akxm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b\u0004\u1003\u0001", new Object[] { "f", "b", "c", akxn.class, "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
