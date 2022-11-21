import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiz extends ahcz implements aheo
{
    public static final amiz a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ahbt d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amiz.class, a = new amiz());
    }
    
    private amiz() {
        this.g = 2;
        this.d = ahbt.b;
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
                final ahev e;
                if ((e = amiz.e) == null) {
                    synchronized (amiz.class) {
                        if (amiz.e == null) {
                            amiz.e = (ahev)new ahcs((ahcz)amiz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amiz.a;
            }
            case 4: {
                return new ahcr((ahcz)amiz.a);
            }
            case 3: {
                return new amiz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amiz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u100a\u0003", new Object[] { "b", "c", "f", "d" });
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
