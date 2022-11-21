import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahof extends ahcz implements aheo
{
    public static final ahof a;
    private static volatile ahev f;
    public ahdp b;
    public ahdp c;
    public ahoq d;
    public String e;
    private int g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ahof.class, a = new ahof());
    }
    
    private ahof() {
        this.h = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahof.f) == null) {
                    synchronized (ahof.class) {
                        if (ahof.f == null) {
                            ahof.f = (ahev)new ahcs((ahcz)ahof.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahof.a;
            }
            case 4: {
                return new ahcr((ahcz)ahof.a);
            }
            case 3: {
                return new ahof();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahof.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u1009\u0000\u0004\u1008\u0001", new Object[] { "g", "b", aisc.class, "c", aisc.class, "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
