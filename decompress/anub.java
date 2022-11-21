import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anub extends ahcz implements aheo
{
    public static final anub a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(anub.class, a = new anub());
    }
    
    private anub() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = anub.b) == null) {
                    synchronized (anub.class) {
                        if (anub.b == null) {
                            anub.b = (ahev)new ahcs((ahcz)anub.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anub.a;
            }
            case 4: {
                return new ahcr((ahcz)anub.a);
            }
            case 3: {
                return new anub();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anub.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
