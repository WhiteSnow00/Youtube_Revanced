import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antn extends ahcz implements aheo
{
    public static final antn a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(antn.class, a = new antn());
    }
    
    private antn() {
        ahcz.emptyProtobufList();
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
                if ((b = antn.b) == null) {
                    synchronized (antn.class) {
                        if (antn.b == null) {
                            antn.b = (ahev)new ahcs((ahcz)antn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return antn.a;
            }
            case 4: {
                return new ahcr((ahcz)antn.a);
            }
            case 3: {
                return new antn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antn.a, "\u0001\u0000", null);
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
