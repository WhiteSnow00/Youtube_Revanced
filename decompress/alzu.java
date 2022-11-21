import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzu extends ahcz implements aheo
{
    public static final alzu a;
    private static volatile ahev c;
    public int b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(alzu.class, a = new alzu());
    }
    
    private alzu() {
        this.b = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = alzu.c) == null) {
                    synchronized (alzu.class) {
                        if (alzu.c == null) {
                            alzu.c = (ahev)new ahcs((ahcz)alzu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alzu.a;
            }
            case 4: {
                return new ahcr((ahcz)alzu.a);
            }
            case 3: {
                return new alzu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", alwa.t });
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
