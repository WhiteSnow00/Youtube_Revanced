import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqix extends ahcz implements aheo
{
    public static final aqix a;
    private static volatile ahev f;
    public String b;
    public ahbt c;
    public int d;
    public String e;
    private int g;
    
    static {
        ahcz.registerDefaultInstance(aqix.class, a = new aqix());
    }
    
    private aqix() {
        this.b = "";
        this.c = ahbt.b;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqix.f) == null) {
                    synchronized (aqix.class) {
                        if (aqix.f == null) {
                            aqix.f = (ahev)new ahcs((ahcz)aqix.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqix.a;
            }
            case 4: {
                return new ahcr((ahcz)aqix.a);
            }
            case 3: {
                return new aqix();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqix.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u100c\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", aqdx.q, "e" });
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
