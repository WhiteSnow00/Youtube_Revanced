import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxi extends ahcz implements aheo
{
    public static final akxi a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxi.class, a = new akxi());
    }
    
    private akxi() {
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
                final ahev d;
                if ((d = akxi.d) == null) {
                    synchronized (akxi.class) {
                        if (akxi.d == null) {
                            akxi.d = (ahev)new ahcs((ahcz)akxi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akxi.a;
            }
            case 4: {
                return new ahcr((ahcz)akxi.a);
            }
            case 3: {
                return new akxi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxi.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u041b\u0309\u1409\u0001", new Object[] { "e", "b", "c", aisc.class, "f" });
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
