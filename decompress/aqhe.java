import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhe extends ahcz implements aheo
{
    public static final aqhe a;
    private static volatile ahev b;
    private ahej c;
    
    static {
        ahcz.registerDefaultInstance(aqhe.class, a = new aqhe());
    }
    
    private aqhe() {
        this.c = ahej.a;
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
                if ((b = aqhe.b) == null) {
                    synchronized (aqhe.class) {
                        if (aqhe.b == null) {
                            aqhe.b = (ahev)new ahcs((ahcz)aqhe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqhe.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhe.a);
            }
            case 3: {
                return new aqhe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhe.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aqhd.a });
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
