import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqro extends ahcz implements aheo
{
    public static final aqro a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqro.class, a = new aqro());
    }
    
    private aqro() {
        this.b = "";
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
                if ((c = aqro.c) == null) {
                    synchronized (aqro.class) {
                        if (aqro.c == null) {
                            aqro.c = (ahev)new ahcs((ahcz)aqro.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqro.a;
            }
            case 4: {
                return new ahcr((ahcz)aqro.a);
            }
            case 3: {
                return new aqro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqro.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
