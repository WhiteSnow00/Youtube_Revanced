import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apip extends ahcz implements aheo
{
    public static final apip a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public String d;
    public ahdp e;
    public ahdp f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apip.class, a = new apip());
    }
    
    private apip() {
        this.h = 2;
        this.d = "";
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
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
                final ahev g;
                if ((g = apip.g) == null) {
                    synchronized (apip.class) {
                        if (apip.g == null) {
                            apip.g = (ahev)new ahcs((ahcz)apip.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apip.a;
            }
            case 4: {
                return new ahcr((short[][][])null, (char[][][])null);
            }
            case 3: {
                return new apip();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apip.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u001b", new Object[] { "b", "c", "d", "e", aoeo.class, "f", aoeo.class });
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
