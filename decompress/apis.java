import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apis extends ahcz implements aheo
{
    public static final apis a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public ahdp d;
    public String e;
    public aisc f;
    private byte h;
    
    static {
        final apis a2 = new apis();
        ahcz.registerDefaultInstance(apis.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 126705043, ahgc.k, apis.class);
    }
    
    private apis() {
        this.h = 2;
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
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
                final ahev g;
                if ((g = apis.g) == null) {
                    synchronized (apis.class) {
                        if (apis.g == null) {
                            apis.g = (ahev)new ahcs((ahcz)apis.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apis.a;
            }
            case 4: {
                return new ahcr((ahcz)apis.a);
            }
            case 3: {
                return new apis();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apis.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u001b\u0004\u1008\u0000\u0005\u1409\u0001", new Object[] { "c", "d", akuf.class, "e", "f" });
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
