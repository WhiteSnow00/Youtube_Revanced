import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrg extends ahcz implements aheo
{
    public static final aqrg a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqrg.class, a = new aqrg());
    }
    
    private aqrg() {
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
                final ahev c;
                if ((c = aqrg.c) == null) {
                    synchronized (aqrg.class) {
                        if (aqrg.c == null) {
                            aqrg.c = (ahev)new ahcs((ahcz)aqrg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrg.a);
            }
            case 3: {
                return new aqrg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
