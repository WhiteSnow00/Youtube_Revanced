import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfa extends ahcz implements aheo
{
    public static final apfa a;
    private static volatile ahev b;
    private int c;
    private ajwg d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apfa.class, a = new apfa());
    }
    
    private apfa() {
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
                if ((b = apfa.b) == null) {
                    synchronized (apfa.class) {
                        if (apfa.b == null) {
                            apfa.b = (ahev)new ahcs((ahcz)apfa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfa.a;
            }
            case 4: {
                return new ahcr((ahcz)apfa.a);
            }
            case 3: {
                return new apfa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfa.a, "\u0001\u0001\u0000\u0001\uf52d\u2bbe\uf52d\u2bbe\u0001\u0000\u0000\u0001\uf52d\u2bbe\u1409\u0000", new Object[] { "c", "d" });
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
