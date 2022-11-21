import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algn extends ahcz implements aheo
{
    public static final algn a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algn.class, a = new algn());
    }
    
    private algn() {
        this.b = 0;
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
                if ((d = algn.d) == null) {
                    synchronized (algn.class) {
                        if (algn.d == null) {
                            algn.d = (ahev)new ahcs((ahcz)algn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algn.a;
            }
            case 4: {
                return new ahcr((ahcz)algn.a);
            }
            case 3: {
                return new algn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algn.a, "\u0001\u0004\u0001\u0000\uf897\u18b0\ue1ab\u3bc6\u0004\u0000\u0000\u0004\uf897\u18b0\u143c\u0000\uf8af\u18b0\u143c\u0000\uedf1\u38ca\u143c\u0000\ue1ab\u3bc6\u143c\u0000", new Object[] { "c", "b", algd.class, alge.class, ajyr.class, alfy.class });
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
