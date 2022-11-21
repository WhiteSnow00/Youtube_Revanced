import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooa extends ahcz implements aheo
{
    public static final aooa a;
    private static volatile ahev d;
    public int b;
    public aonz c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aooa.class, a = new aooa());
    }
    
    private aooa() {
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
                if ((d = aooa.d) == null) {
                    synchronized (aooa.class) {
                        if (aooa.d == null) {
                            aooa.d = (ahev)new ahcs((ahcz)aooa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aooa.a;
            }
            case 4: {
                return new ahcr((ahcz)aooa.a);
            }
            case 3: {
                return new aooa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aooa.a, "\u0001\u0001\u0000\u0001\uffc9\u3a37\uffc9\u3a37\u0001\u0000\u0000\u0001\uffc9\u3a37\u1409\u0000", new Object[] { "b", "c" });
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
