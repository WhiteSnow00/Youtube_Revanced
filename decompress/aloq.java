import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloq extends ahcz implements aheo
{
    public static final aloq a;
    private static volatile ahev k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    
    static {
        ahcz.registerDefaultInstance(aloq.class, a = new aloq());
    }
    
    private aloq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aloq.k) == null) {
                    synchronized (aloq.class) {
                        if (aloq.k == null) {
                            aloq.k = (ahev)new ahcs((ahcz)aloq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aloq.a;
            }
            case 4: {
                return new ahcr((ahcz)aloq.a);
            }
            case 3: {
                return new aloq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aloq.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u1007\u0006\b\u100c\u0007", new Object[] { "b", "c", alpa.g, "d", alpa.f, "e", alpa.e, "f", anus.j, "g", anus.b, "h", ansp.u, "i", "j", alpf.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
