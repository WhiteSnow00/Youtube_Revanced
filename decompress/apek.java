import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apek extends ahcz implements aheo
{
    public static final apek a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apek.class, a = new apek());
    }
    
    private apek() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apek.b) == null) {
                    synchronized (apek.class) {
                        if (apek.b == null) {
                            apek.b = (ahev)new ahcs((ahcz)apek.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apek.a;
            }
            case 4: {
                return new ahcr((ahcz)apek.a);
            }
            case 3: {
                return new apek();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apek.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
