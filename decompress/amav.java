import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amav extends ahcz implements aheo
{
    public static final amav a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public ahdp e;
    public String f;
    
    static {
        final amav a2 = new amav();
        ahcz.registerDefaultInstance(amav.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 164, ahgc.k, amav.class);
    }
    
    private amav() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = ahcz.emptyProtobufList();
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = amav.g) == null) {
                    synchronized (amav.class) {
                        if (amav.g == null) {
                            amav.g = (ahev)new ahcs((ahcz)amav.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amav.a;
            }
            case 4: {
                return new ahcr((short[])null, (int[][])null);
            }
            case 3: {
                return new amav();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amav.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0003\u001b\u0004\u1008\u0002", new Object[] { "c", "d", "e", amau.class, "f" });
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
