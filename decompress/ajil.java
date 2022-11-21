import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajil extends ahcz implements aheo
{
    private static final ajil a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(ajil.class, a = new ajil());
    }
    
    private ajil() {
    }
    
    public static ajik a() {
        return (ajik)ajil.a.createBuilder();
    }
    
    static ajil b() {
        return ajil.a;
    }
    
    public static void c(final ajil ajil, final boolean b) {
        ajil.d(b);
    }
    
    private void d(final boolean d) {
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
                if ((b = ajil.b) == null) {
                    synchronized (ajil.class) {
                        if (ajil.b == null) {
                            ajil.b = (ahev)new ahcs((ahcz)ajil.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajil.a;
            }
            case 4: {
                return new ajik();
            }
            case 3: {
                return new ajil();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajil.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
