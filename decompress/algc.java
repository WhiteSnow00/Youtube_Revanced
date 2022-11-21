import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algc extends ahcz implements aheo
{
    public static final algc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algc.class, a = new algc());
    }
    
    private algc() {
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
                if ((d = algc.d) == null) {
                    synchronized (algc.class) {
                        if (algc.d == null) {
                            algc.d = (ahev)new ahcs((ahcz)algc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algc.a;
            }
            case 4: {
                return new ahcr((ahcz)algc.a);
            }
            case 3: {
                return new algc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algc.a, "\u0001\u0003\u0001\u0000\ue7f5\u178e\ufd78\u2bb9\u0003\u0000\u0000\u0003\ue7f5\u178e\u143c\u0000\ufa99\u215a\u143c\u0000\ufd78\u2bb9\u143c\u0000", new Object[] { "c", "b", aobc.class, amkl.class, algq.class });
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
