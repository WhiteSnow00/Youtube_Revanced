import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhj extends ahcz implements aheo
{
    public static final alhj a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public String d;
    public String e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alhj.class, a = new alhj());
    }
    
    private alhj() {
        this.g = 2;
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alhj.f) == null) {
                    synchronized (alhj.class) {
                        if (alhj.f == null) {
                            alhj.f = (ahev)new ahcs((ahcz)alhj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alhj.a;
            }
            case 4: {
                return new ahcr((ahcz)alhj.a);
            }
            case 3: {
                return new alhj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
