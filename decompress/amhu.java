import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhu extends ahcz implements aheo
{
    private static final amhu a;
    private static volatile ahev b;
    private String c;
    private String d;
    
    static {
        ahcz.registerDefaultInstance(amhu.class, a = new amhu());
    }
    
    private amhu() {
        this.c = "";
        this.d = "";
    }
    
    public static amhu a() {
        return amhu.a;
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
                if ((b = amhu.b) == null) {
                    synchronized (amhu.class) {
                        if (amhu.b == null) {
                            amhu.b = (ahev)new ahcs((ahcz)amhu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhu.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new amhu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhu.a, "\u0001\u0000", null);
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
