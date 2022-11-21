import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexa extends ahcz implements aheo
{
    public static final aexa a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahej d;
    
    static {
        ahcz.registerDefaultInstance(aexa.class, a = new aexa());
    }
    
    private aexa() {
        this.d = ahej.a;
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
                if ((e = aexa.e) == null) {
                    synchronized (aexa.class) {
                        if (aexa.e == null) {
                            aexa.e = (ahev)new ahcs((ahcz)aexa.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aexa.a;
            }
            case 4: {
                return new ahcr((ahcz)aexa.a);
            }
            case 3: {
                return new aexa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexa.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1008\u0000\u00022", new Object[] { "b", "c", "d", aewz.a });
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
