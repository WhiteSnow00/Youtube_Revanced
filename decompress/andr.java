import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andr extends ahcz implements aheo
{
    public static final andr a;
    private static volatile ahev l;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public ands i;
    public ands j;
    public boolean k;
    
    static {
        ahcz.registerDefaultInstance(andr.class, a = new andr());
    }
    
    private andr() {
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
                if ((l = andr.l) == null) {
                    synchronized (andr.class) {
                        if (andr.l == null) {
                            andr.l = (ahev)new ahcs((ahcz)andr.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return andr.a;
            }
            case 4: {
                return new ahcr((ahcz)andr.a);
            }
            case 3: {
                return new andr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andr.a, "\u0001\t\u0000\u0001\u0001\u0013\t\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0005\u0003\u1004\u0001\u0007\u1004\u0004\b\u1007\t\u000b\u1009\u000b\f\u1009\f\u0012\u1007\n\u0013\u1007\u0011", new Object[] { "b", "c", "f", "d", "e", "g", "i", "j", "h", "k" });
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
