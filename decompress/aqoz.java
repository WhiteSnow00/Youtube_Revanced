import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoz extends ahcz implements aheo
{
    private static final aqoz a;
    private static volatile ahev b;
    private String c;
    private ahbt d;
    
    static {
        ahcz.registerDefaultInstance(aqoz.class, a = new aqoz());
    }
    
    private aqoz() {
        this.c = "";
        this.d = ahbt.b;
    }
    
    public static aqoz a() {
        return aqoz.a;
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
                if ((b = aqoz.b) == null) {
                    synchronized (aqoz.class) {
                        if (aqoz.b == null) {
                            aqoz.b = (ahev)new ahcs((ahcz)aqoz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqoz.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new aqoz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoz.a, "\u0001\u0000", null);
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
