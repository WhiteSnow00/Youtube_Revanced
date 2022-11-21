import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwv extends ahcz implements aheo
{
    public static final akwv a;
    private static volatile ahev d;
    public aknj b;
    public ahdp c;
    private int e;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akwv.class, a = new akwv());
    }
    
    private akwv() {
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
                if ((d = akwv.d) == null) {
                    synchronized (akwv.class) {
                        if (akwv.d == null) {
                            akwv.d = (ahev)new ahcs((ahcz)akwv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwv.a;
            }
            case 4: {
                return new ahcr((ahcz)akwv.a);
            }
            case 3: {
                return new akwv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwv.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u041b\u0309\u1409\u0001", new Object[] { "e", "b", "c", aisc.class, "f" });
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
