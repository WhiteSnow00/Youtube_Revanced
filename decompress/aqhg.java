import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhg extends ahcz implements aheo
{
    public static final aqhg a;
    private static volatile ahev c;
    public boolean b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aqhg.class, a = new aqhg());
    }
    
    private aqhg() {
        this.b = true;
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
                if ((c = aqhg.c) == null) {
                    synchronized (aqhg.class) {
                        if (aqhg.c == null) {
                            aqhg.c = (ahev)new ahcs((ahcz)aqhg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqhg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhg.a);
            }
            case 3: {
                return new aqhg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
