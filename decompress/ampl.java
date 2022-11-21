import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampl extends ahcz implements aheo
{
    public static final ampl a;
    private static volatile ahev b;
    private int c;
    private aprl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ampl.class, a = new ampl());
    }
    
    private ampl() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ampl.b) == null) {
                    synchronized (ampl.class) {
                        if (ampl.b == null) {
                            ampl.b = (ahev)new ahcs((ahcz)ampl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampl.a;
            }
            case 4: {
                return new ahcr((ahcz)ampl.a);
            }
            case 3: {
                return new ampl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampl.a, "\u0001\u0001\u0000\u0001\uea90\u2a84\uea90\u2a84\u0001\u0000\u0000\u0001\uea90\u2a84\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
