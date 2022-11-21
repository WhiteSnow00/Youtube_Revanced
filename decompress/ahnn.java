import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnn extends ahcz implements aheo
{
    private static final ahnn a;
    private static volatile ahev b;
    private String c;
    private String d;
    
    static {
        ahcz.registerDefaultInstance(ahnn.class, a = new ahnn());
    }
    
    private ahnn() {
        this.c = "";
        this.d = "";
    }
    
    public static ahnn a() {
        return ahnn.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ahnn.b) == null) {
                    synchronized (ahnn.class) {
                        if (ahnn.b == null) {
                            ahnn.b = (ahev)new ahcs((ahcz)ahnn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnn.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new ahnn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnn.a, "\u0001\u0000", null);
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
