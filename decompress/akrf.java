import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrf extends ahcz implements aheo
{
    public static final akrf a;
    private static volatile ahev c;
    public amld b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akrf.class, a = new akrf());
    }
    
    private akrf() {
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
                if ((c = akrf.c) == null) {
                    synchronized (akrf.class) {
                        if (akrf.c == null) {
                            akrf.c = (ahev)new ahcs((ahcz)akrf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akrf.a;
            }
            case 4: {
                return new ahcr((ahcz)akrf.a);
            }
            case 3: {
                return new akrf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrf.a, "\u0001\u0001\u0000\u0001\uf5b8\u3aab\uf5b8\u3aab\u0001\u0000\u0000\u0001\uf5b8\u3aab\u1409\u0000", new Object[] { "d", "b" });
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
