import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algv extends ahcz implements aheo
{
    public static final algv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algv.class, a = new algv());
    }
    
    private algv() {
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
                if ((d = algv.d) == null) {
                    synchronized (algv.class) {
                        if (algv.d == null) {
                            algv.d = (ahev)new ahcs((ahcz)algv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algv.a;
            }
            case 4: {
                return new ahcr((ahcz)algv.a);
            }
            case 3: {
                return new algv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algv.a, "\u0001\u0002\u0001\u0000\ue18f\u3ee5\ue923\u4da1\u0002\u0000\u0000\u0002\ue18f\u3ee5\u143c\u0000\ue923\u4da1\u143c\u0000", new Object[] { "c", "b", amxf.class, ajxo.class });
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
