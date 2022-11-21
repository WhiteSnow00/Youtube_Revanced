import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansx extends ahcz implements aheo
{
    public static final ansx a;
    private static volatile ahev l;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ajtp j;
    public boolean k;
    
    static {
        ahcz.registerDefaultInstance(ansx.class, a = new ansx());
    }
    
    private ansx() {
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
                if ((l = ansx.l) == null) {
                    synchronized (ansx.class) {
                        if (ansx.l == null) {
                            ansx.l = (ahev)new ahcs((ahcz)ansx.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ansx.a;
            }
            case 4: {
                return new ahcr((ahcz)ansx.a);
            }
            case 3: {
                return new ansx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansx.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0004\u1004\u0003\u0005\u100c\u0004\u0006\u1004\u0005\u0007\u1004\u0006\t\u100c\b\n\u1009\t\u000b\u1007\n", new Object[] { "b", "c", "d", "e", "f", ansp.c, "g", "h", "i", ansp.d, "j", "k" });
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
