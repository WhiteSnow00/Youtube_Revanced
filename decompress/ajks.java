import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajks extends ahcz implements aheo
{
    public static final ajks a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final ajks a2 = new ajks();
        ahcz.registerDefaultInstance(ajks.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 301, ahgc.k, ajks.class);
    }
    
    private ajks() {
        this.d = "";
        this.e = "";
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
                if ((g = ajks.g) == null) {
                    synchronized (ajks.class) {
                        if (ajks.g == null) {
                            ajks.g = (ahev)new ahcs((ahcz)ajks.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajks.a;
            }
            case 4: {
                return new ahcr((ahcz)ajks.a);
            }
            case 3: {
                return new ajks();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajks.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
