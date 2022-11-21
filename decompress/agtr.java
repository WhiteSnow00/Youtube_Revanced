import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtr extends ahcz implements aheo
{
    public static final agtr a;
    private static volatile ahev c;
    public aeju b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(agtr.class, a = new agtr());
    }
    
    private agtr() {
        this.d = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 0;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = agtr.c) == null) {
                    synchronized (agtr.class) {
                        if (agtr.c == null) {
                            agtr.c = (ahev)new ahcs((ahcz)agtr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agtr.a;
            }
            case 4: {
                return new ahcr((ahcz)agtr.a);
            }
            case 3: {
                return new agtr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtr.a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u0409", new Object[] { "b" });
            }
            case 1: {
                if (o != null) {
                    d = 1;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
