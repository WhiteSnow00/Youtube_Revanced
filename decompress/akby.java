import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akby extends ahcz implements aheo
{
    public static final akby a;
    private static volatile ahev b;
    private int c;
    private aicd d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akby.class, a = new akby());
    }
    
    private akby() {
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
                if ((b = akby.b) == null) {
                    synchronized (akby.class) {
                        if (akby.b == null) {
                            akby.b = (ahev)new ahcs((ahcz)akby.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akby.a;
            }
            case 4: {
                return new ahcr((ahcz)akby.a);
            }
            case 3: {
                return new akby();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akby.a, "\u0001\u0001\u0000\u0001\ue14a\u1cb1\ue14a\u1cb1\u0001\u0000\u0000\u0001\ue14a\u1cb1\u1409\u0000", new Object[] { "c", "d" });
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
