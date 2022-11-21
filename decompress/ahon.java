import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahon extends ahcz implements aheo
{
    public static final ahon a;
    private static volatile ahev h;
    public int b;
    public String c;
    public int d;
    public ahdp e;
    public boolean f;
    public ahbt g;
    
    static {
        ahcz.registerDefaultInstance(ahon.class, a = new ahon());
    }
    
    private ahon() {
        this.c = "";
        this.e = ahcz.emptyProtobufList();
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = ahon.h) == null) {
                    synchronized (ahon.class) {
                        if (ahon.h == null) {
                            ahon.h = (ahev)new ahcs((ahcz)ahon.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahon.a;
            }
            case 4: {
                return new ahcr((ahcz)ahon.a);
            }
            case 3: {
                return new ahon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahon.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u100a\u0003", new Object[] { "b", "c", "d", "e", alyg.class, "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
