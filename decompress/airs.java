import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airs extends ahcz implements aheo
{
    public static final airs a;
    private static volatile ahev d;
    public anxb b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(airs.class, a = new airs());
    }
    
    private airs() {
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
                if ((d = airs.d) == null) {
                    synchronized (airs.class) {
                        if (airs.d == null) {
                            airs.d = (ahev)new ahcs((ahcz)airs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return airs.a;
            }
            case 4: {
                return new ahcr((ahcz)airs.a);
            }
            case 3: {
                return new airs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)airs.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002\u100c\u0001\u0003\u1409\u0000", new Object[] { "e", "c", ahld.g, "b" });
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
