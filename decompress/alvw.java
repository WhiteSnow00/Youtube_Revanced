import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvw extends ahcz implements aheo
{
    public static final alvw a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(alvw.class, a = new alvw());
    }
    
    private alvw() {
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
                if ((b = alvw.b) == null) {
                    synchronized (alvw.class) {
                        if (alvw.b == null) {
                            alvw.b = (ahev)new ahcs((ahcz)alvw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvw.a;
            }
            case 4: {
                return new ahcr((ahcz)alvw.a);
            }
            case 3: {
                return new alvw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvw.a, "\u0001\u0000", null);
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
