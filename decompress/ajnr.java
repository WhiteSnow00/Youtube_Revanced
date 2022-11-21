import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnr extends ahcz implements aheo
{
    public static final ajnr a;
    private static volatile ahev g;
    public int b;
    public int c;
    public String d;
    public String e;
    public ajnq f;
    
    static {
        ahcz.registerDefaultInstance(ajnr.class, a = new ajnr());
    }
    
    private ajnr() {
        this.d = "";
        this.e = "";
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
                if ((g = ajnr.g) == null) {
                    synchronized (ajnr.class) {
                        if (ajnr.g == null) {
                            ajnr.g = (ahev)new ahcs((ahcz)ajnr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajnr.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnr.a);
            }
            case 3: {
                return new ajnr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnr.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", aprg.a(), "d", "e", "f" });
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
