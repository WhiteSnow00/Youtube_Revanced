import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahny extends ahcz implements aheo
{
    public static final ahny a;
    private static volatile ahev e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(ahny.class, a = new ahny());
    }
    
    private ahny() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahny.e) == null) {
                    synchronized (ahny.class) {
                        if (ahny.e == null) {
                            ahny.e = (ahev)new ahcs((ahcz)ahny.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahny.a;
            }
            case 4: {
                return new ahcr((ahcz)ahny.a);
            }
            case 3: {
                return new ahny();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahny.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
