import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahot extends ahcz implements aheo
{
    public static final ahot a;
    private static volatile ahev g;
    public int b;
    public int c;
    public boolean d;
    public float e;
    public int f;
    private int h;
    private int i;
    private int j;
    
    static {
        ahcz.registerDefaultInstance(ahot.class, a = new ahot());
    }
    
    private ahot() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = ahot.g) == null) {
                    synchronized (ahot.class) {
                        if (ahot.g == null) {
                            ahot.g = (ahev)new ahcs((ahcz)ahot.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahot.a;
            }
            case 4: {
                return new ahcr((ahcz)ahot.a);
            }
            case 3: {
                return new ahot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahot.a, "\u0001\u0005\u0000\u0003\u0007E\u0005\u0000\u0000\u0000\u0007\u1004\u0005A\u100c<C\u1007>D\u1001?E\u1004@", new Object[] { "h", "i", "j", "b", "c", ahld.i, "d", "e", "f" });
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
