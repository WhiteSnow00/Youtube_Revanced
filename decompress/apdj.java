import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdj extends ahcz implements aheo
{
    public static final apdj a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apdj.class, a = new apdj());
    }
    
    private apdj() {
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
                if ((d = apdj.d) == null) {
                    synchronized (apdj.class) {
                        if (apdj.d == null) {
                            apdj.d = (ahev)new ahcs((ahcz)apdj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdj.a;
            }
            case 4: {
                return new ahcr((ahcz)apdj.a);
            }
            case 3: {
                return new apdj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdj.a, "\u0001\u0002\u0001\u0000\uf26a\u2912\ue91b\u3cbe\u0002\u0000\u0000\u0002\uf26a\u2912\u143c\u0000\ue91b\u3cbe\u143c\u0000", new Object[] { "c", "b", allh.class, apcu.class });
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
