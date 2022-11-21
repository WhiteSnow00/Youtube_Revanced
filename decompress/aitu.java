import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitu extends ahcz implements aheo
{
    public static final aitu a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(aitu.class, a = new aitu());
    }
    
    private aitu() {
        this.c = 2;
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
                if ((b = aitu.b) == null) {
                    synchronized (aitu.class) {
                        if (aitu.b == null) {
                            aitu.b = (ahev)new ahcs((ahcz)aitu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aitu.a;
            }
            case 4: {
                return new ahcr((ahcz)aitu.a);
            }
            case 3: {
                return new aitu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitu.a, "\u0001\u0000", null);
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
