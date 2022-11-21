import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpb extends ahcz implements aheo
{
    private static final aqpb a;
    private static volatile ahev b;
    private int c;
    private String d;
    
    static {
        ahcz.registerDefaultInstance(aqpb.class, a = new aqpb());
    }
    
    private aqpb() {
        this.d = "";
    }
    
    public static aqpa a() {
        return (aqpa)aqpb.a.createBuilder();
    }
    
    static aqpb b() {
        return aqpb.a;
    }
    
    public static void c(final aqpb aqpb, final String s) {
        aqpb.d(s);
    }
    
    private void d(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqpb.b) == null) {
                    synchronized (aqpb.class) {
                        if (aqpb.b == null) {
                            aqpb.b = (ahev)new ahcs((ahcz)aqpb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqpb.a;
            }
            case 4: {
                return new aqpa();
            }
            case 3: {
                return new aqpb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
