import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aids extends ahcz implements aheo
{
    public static final aids a;
    private static volatile ahev d;
    public int b;
    public aidt c;
    private aidr e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aids.class, a = new aids());
    }
    
    private aids() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aids.d) == null) {
                    synchronized (aids.class) {
                        if (aids.d == null) {
                            aids.d = (ahev)new ahcs((ahcz)aids.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aids.a;
            }
            case 4: {
                return new ahcr((ahcz)aids.a);
            }
            case 3: {
                return new aids();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aids.a, "\u0001\u0002\u0000\u0001\uf2a1\u264b\uf6f4\u2f9e\u0002\u0000\u0000\u0002\uf2a1\u264b\u1409\u0000\uf6f4\u2f9e\u1409\u0001", new Object[] { "b", "e", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
