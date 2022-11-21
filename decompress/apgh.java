import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgh extends ahcz implements aheo
{
    public static final apgh a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private aisc f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apgh.class, a = new apgh());
    }
    
    private apgh() {
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
                if ((b = apgh.b) == null) {
                    synchronized (apgh.class) {
                        if (apgh.b == null) {
                            apgh.b = (ahev)new ahcs((ahcz)apgh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgh.a;
            }
            case 4: {
                return new ahcr((ahcz)apgh.a);
            }
            case 3: {
                return new apgh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgh.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
