import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appe extends ahcz implements aheo
{
    public static final appe a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(appe.class, a = new appe());
    }
    
    private appe() {
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
                if ((b = appe.b) == null) {
                    synchronized (appe.class) {
                        if (appe.b == null) {
                            appe.b = (ahev)new ahcs((ahcz)appe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appe.a;
            }
            case 4: {
                return new ahcr((ahcz)appe.a);
            }
            case 3: {
                return new appe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
