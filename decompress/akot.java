import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akot extends ahcz implements aheo
{
    public static final akot a;
    private static volatile ahev d;
    public String b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(akot.class, a = new akot());
    }
    
    private akot() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = akot.d) == null) {
                    synchronized (akot.class) {
                        if (akot.d == null) {
                            akot.d = (ahev)new ahcs((ahcz)akot.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akot.a;
            }
            case 4: {
                return new ahcr((ahcz)akot.a);
            }
            case 3: {
                return new akot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akot.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ansp.t });
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
