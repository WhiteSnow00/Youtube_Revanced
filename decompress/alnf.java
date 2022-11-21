import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnf extends ahcz implements aheo
{
    public static final alnf a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnf.class, a = new alnf());
    }
    
    private alnf() {
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
                if ((b = alnf.b) == null) {
                    synchronized (alnf.class) {
                        if (alnf.b == null) {
                            alnf.b = (ahev)new ahcs((ahcz)alnf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnf.a;
            }
            case 4: {
                return new ahcr((ahcz)alnf.a);
            }
            case 3: {
                return new alnf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnf.a, "\u0001\u0000", null);
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
