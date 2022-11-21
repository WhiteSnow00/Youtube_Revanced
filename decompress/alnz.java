import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnz extends ahcz implements aheo
{
    public static final alnz a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnz.class, a = new alnz());
    }
    
    private alnz() {
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
                if ((b = alnz.b) == null) {
                    synchronized (alnz.class) {
                        if (alnz.b == null) {
                            alnz.b = (ahev)new ahcs((ahcz)alnz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnz.a;
            }
            case 4: {
                return new ahcr((ahcz)alnz.a);
            }
            case 3: {
                return new alnz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnz.a, "\u0001\u0000", null);
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
