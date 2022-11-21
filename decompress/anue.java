import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anue extends ahcz implements aheo
{
    public static final anue a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(anue.class, a = new anue());
    }
    
    private anue() {
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
                if ((b = anue.b) == null) {
                    synchronized (anue.class) {
                        if (anue.b == null) {
                            anue.b = (ahev)new ahcs((ahcz)anue.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anue.a;
            }
            case 4: {
                return new ahcr((ahcz)anue.a);
            }
            case 3: {
                return new anue();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anue.a, "\u0001\u0000", null);
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
