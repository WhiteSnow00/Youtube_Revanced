import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnw extends ahcz implements aheo
{
    public static final alnw a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnw.class, a = new alnw());
    }
    
    private alnw() {
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
                if ((b = alnw.b) == null) {
                    synchronized (alnw.class) {
                        if (alnw.b == null) {
                            alnw.b = (ahev)new ahcs((ahcz)alnw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnw.a;
            }
            case 4: {
                return new ahcr((ahcz)alnw.a);
            }
            case 3: {
                return new alnw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnw.a, "\u0001\u0000", null);
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
