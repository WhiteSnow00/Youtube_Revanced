import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrn extends ahcz implements aheo
{
    public static final akrn a;
    private static volatile ahev e;
    public aknj b;
    public ahdp c;
    public ahdp d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akrn.class, a = new akrn());
    }
    
    private akrn() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
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
                if ((e = akrn.e) == null) {
                    synchronized (akrn.class) {
                        if (akrn.e == null) {
                            akrn.e = (ahev)new ahcs((ahcz)akrn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akrn.a;
            }
            case 4: {
                return new ahcr((ahcz)akrn.a);
            }
            case 3: {
                return new akrn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrn.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0003\u0001\u1409\u0000\u0003\u041b\u0004\u041b", new Object[] { "f", "b", "c", akrj.class, "d", anxb.class });
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
