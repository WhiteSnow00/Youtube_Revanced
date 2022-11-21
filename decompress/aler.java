import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aler extends ahcz implements aheo
{
    public static final aler a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aler.class, a = new aler());
    }
    
    private aler() {
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
                if ((d = aler.d) == null) {
                    synchronized (aler.class) {
                        if (aler.d == null) {
                            aler.d = (ahev)new ahcs((ahcz)aler.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aler.a;
            }
            case 4: {
                return new ahcr((ahcz)aler.a);
            }
            case 3: {
                return new aler();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aler.a, "\u0001\u0002\u0001\u0000\ue517\u1e94\ue5a3\u2883\u0002\u0000\u0000\u0001\ue517\u1e94\u143c\u0000\ue5a3\u2883\u103c\u0000", new Object[] { "c", "b", apkk.class, ajcn.class });
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
