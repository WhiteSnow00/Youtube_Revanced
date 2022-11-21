import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnp extends ahcz implements aheo
{
    public static final alnp a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnp.class, a = new alnp());
    }
    
    private alnp() {
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
                if ((b = alnp.b) == null) {
                    synchronized (alnp.class) {
                        if (alnp.b == null) {
                            alnp.b = (ahev)new ahcs((ahcz)alnp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnp.a;
            }
            case 4: {
                return new ahcr((ahcz)alnp.a);
            }
            case 3: {
                return new alnp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnp.a, "\u0001\u0000", null);
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
