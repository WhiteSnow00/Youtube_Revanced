import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araq extends ahcz implements aheo
{
    private static final araq a;
    private static volatile ahev b;
    private int c;
    private String d;
    
    static {
        ahcz.registerDefaultInstance(araq.class, a = new araq());
    }
    
    private araq() {
        this.d = "";
    }
    
    public static arap a() {
        return (arap)araq.a.createBuilder();
    }
    
    static araq b() {
        return araq.a;
    }
    
    public static void c(final araq araq, final String s) {
        araq.d(s);
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
                if ((b = araq.b) == null) {
                    synchronized (araq.class) {
                        if (araq.b == null) {
                            araq.b = (ahev)new ahcs((ahcz)araq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return araq.a;
            }
            case 4: {
                return new arap();
            }
            case 3: {
                return new araq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)araq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
