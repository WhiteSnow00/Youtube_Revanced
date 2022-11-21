import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amic extends ahcz implements aheo
{
    public static final amic a;
    private static volatile ahev l;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;
    
    static {
        ahcz.registerDefaultInstance(amic.class, a = new amic());
    }
    
    private amic() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = amic.l) == null) {
                    synchronized (amic.class) {
                        if (amic.l == null) {
                            amic.l = (ahev)new ahcs((ahcz)amic.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return amic.a;
            }
            case 4: {
                return new ahcr((ahcz)amic.a);
            }
            case 3: {
                return new amic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amic.a, "\u0001\n\u0000\u0001\u0003\r\n\u0000\u0000\u0000\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1004\u0004\u0006\u1007\u0005\u0007\u1007\u0006\t\u1004\b\n\u1007\t\u000b\u1007\n\f\u1007\u000b\r\u1007\f", new Object[] { "m", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
