import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algz extends ahcz implements aheo
{
    public static final algz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algz.class, a = new algz());
    }
    
    private algz() {
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
                if ((d = algz.d) == null) {
                    synchronized (algz.class) {
                        if (algz.d == null) {
                            algz.d = (ahev)new ahcs((ahcz)algz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algz.a;
            }
            case 4: {
                return new ahcr((ahcz)algz.a);
            }
            case 3: {
                return new algz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algz.a, "\u0001\u0002\u0001\u0000\uf11d\u1f0a\uf437\u1f3b\u0002\u0000\u0000\u0002\uf11d\u1f0a\u143c\u0000\uf437\u1f3b\u143c\u0000", new Object[] { "c", "b", aqai.class, aqal.class });
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
