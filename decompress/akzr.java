import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzr extends ahcz implements aheo
{
    public static final akzr a;
    private static volatile ahev g;
    public int b;
    public aknh c;
    public String d;
    public ahdp e;
    public String f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akzr.class, a = new akzr());
    }
    
    private akzr() {
        this.h = 2;
        this.d = "";
        this.e = ahcz.emptyProtobufList();
        this.f = "";
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
                if ((g = akzr.g) == null) {
                    synchronized (akzr.class) {
                        if (akzr.g == null) {
                            akzr.g = (ahev)new ahcs((ahcz)akzr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akzr.a;
            }
            case 4: {
                return new ahcr((float[])null, (char[][][])null);
            }
            case 3: {
                return new akzr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzr.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1008\u0001\u0005\u1008\u0002", new Object[] { "b", "c", "e", ankh.class, "d", "f" });
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
