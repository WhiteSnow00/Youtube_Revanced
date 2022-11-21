import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnr extends ahcz implements aheo
{
    public static final alnr a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(alnr.class, a = new alnr());
    }
    
    private alnr() {
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
                if ((b = alnr.b) == null) {
                    synchronized (alnr.class) {
                        if (alnr.b == null) {
                            alnr.b = (ahev)new ahcs((ahcz)alnr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnr.a;
            }
            case 4: {
                return new ahcr((ahcz)alnr.a);
            }
            case 3: {
                return new alnr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnr.a, "\u0001\u0000", null);
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
