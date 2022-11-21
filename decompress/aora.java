import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aora extends ahcz implements aheo
{
    public static final aora a;
    private static volatile ahev d;
    public int b;
    public aoqx c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aora.class, a = new aora());
    }
    
    private aora() {
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
                if ((d = aora.d) == null) {
                    synchronized (aora.class) {
                        if (aora.d == null) {
                            aora.d = (ahev)new ahcs((ahcz)aora.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aora.a;
            }
            case 4: {
                return new ahcr((ahcz)aora.a);
            }
            case 3: {
                return new aora();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aora.a, "\u0001\u0001\u0000\u0001\uee44\u297c\uee44\u297c\u0001\u0000\u0000\u0001\uee44\u297c\u1409\u0000", new Object[] { "b", "c" });
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
