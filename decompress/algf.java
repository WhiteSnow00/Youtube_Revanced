import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algf extends ahcz implements aheo
{
    public static final algf a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algf.class, a = new algf());
    }
    
    private algf() {
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
                if ((d = algf.d) == null) {
                    synchronized (algf.class) {
                        if (algf.d == null) {
                            algf.d = (ahev)new ahcs((ahcz)algf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algf.a;
            }
            case 4: {
                return new ahcr((ahcz)algf.a);
            }
            case 3: {
                return new algf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algf.a, "\u0001\u0006\u0001\u0000\uf321\u1e90\ue16f\u3ce9\u0006\u0000\u0000\u0006\uf321\u1e90\u143c\u0000\ueaaa\u1fae\u143c\u0000\uf42f\u24e3\u143c\u0000\ueaae\u2522\u143c\u0000\ue282\u363f\u143c\u0000\ue16f\u3ce9\u143c\u0000", new Object[] { "c", "b", aizd.class, amiv.class, aojx.class, anai.class, anxo.class, alns.class });
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
