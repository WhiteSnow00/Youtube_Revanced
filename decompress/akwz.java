import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwz extends ahcz implements aheo
{
    public static final akwz a;
    private static volatile ahev d;
    public int b;
    public aknh c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akwz.class, a = new akwz());
    }
    
    private akwz() {
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
                final ahev d;
                if ((d = akwz.d) == null) {
                    synchronized (akwz.class) {
                        if (akwz.d == null) {
                            akwz.d = (ahev)new ahcs((ahcz)akwz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwz.a;
            }
            case 4: {
                return new ahcr((ahcz)akwz.a);
            }
            case 3: {
                return new akwz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
