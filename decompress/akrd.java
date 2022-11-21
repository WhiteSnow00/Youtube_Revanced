import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrd extends ahcz implements aheo
{
    public static final akrd a;
    private static volatile ahev c;
    public ancz b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akrd.class, a = new akrd());
    }
    
    private akrd() {
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
                final ahev c;
                if ((c = akrd.c) == null) {
                    synchronized (akrd.class) {
                        if (akrd.c == null) {
                            akrd.c = (ahev)new ahcs((ahcz)akrd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akrd.a;
            }
            case 4: {
                return new ahcr((ahcz)akrd.a);
            }
            case 3: {
                return new akrd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrd.a, "\u0001\u0001\u0000\u0001\ue287\u3f82\ue287\u3f82\u0001\u0000\u0000\u0001\ue287\u3f82\u1409\u0000", new Object[] { "d", "b" });
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
