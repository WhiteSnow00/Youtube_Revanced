import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphp extends ahcz implements aheo
{
    public static final aphp a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aphp.class, a = new aphp());
    }
    
    private aphp() {
        this.c = 2;
        emptyProtobufList();
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
                if ((b = aphp.b) == null) {
                    synchronized (aphp.class) {
                        if (aphp.b == null) {
                            aphp.b = (ahev)new ahcs((ahcz)aphp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphp.a;
            }
            case 4: {
                return new ahcr((ahcz)aphp.a);
            }
            case 3: {
                return new aphp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphp.a, "\u0001\u0000", null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
