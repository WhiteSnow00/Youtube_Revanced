import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdn extends ahcz implements aheo
{
    public static final apdn a;
    private static volatile ahev b;
    private int c;
    private amjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdn.class, a = new apdn());
    }
    
    private apdn() {
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
                if ((b = apdn.b) == null) {
                    synchronized (apdn.class) {
                        if (apdn.b == null) {
                            apdn.b = (ahev)new ahcs((ahcz)apdn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdn.a;
            }
            case 4: {
                return new ahcr((ahcz)apdn.a);
            }
            case 3: {
                return new apdn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdn.a, "\u0001\u0001\u0000\u0001\ue592\u1be6\ue592\u1be6\u0001\u0000\u0000\u0001\ue592\u1be6\u1409\u0000", new Object[] { "c", "d" });
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
