import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzx extends ahcz implements aheo
{
    public static final akzx a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akzx.class, a = new akzx());
    }
    
    private akzx() {
        this.g = 2;
        emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev d;
                if ((d = akzx.d) == null) {
                    synchronized (akzx.class) {
                        if (akzx.d == null) {
                            akzx.d = (ahev)new ahcs((ahcz)akzx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzx.a;
            }
            case 4: {
                return new ahcr((ahcz)akzx.a);
            }
            case 3: {
                return new akzx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzx.a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0006\u041b\b\u1409\u0004", new Object[] { "e", "b", "c", aisc.class, "f" });
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
