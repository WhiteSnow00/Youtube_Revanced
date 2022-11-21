import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopl extends ahcz implements aheo
{
    public static final aopl a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aopl.class, a = new aopl());
    }
    
    private aopl() {
        this.b = 0;
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
                final ahev d;
                if ((d = aopl.d) == null) {
                    synchronized (aopl.class) {
                        if (aopl.d == null) {
                            aopl.d = (ahev)new ahcs((ahcz)aopl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aopl.a;
            }
            case 4: {
                return new ahcr((ahcz)aopl.a);
            }
            case 3: {
                return new aopl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopl.a, "\u0001\u0001\u0001\u0000\ue631\u3916\ue631\u3916\u0001\u0000\u0000\u0001\ue631\u3916\u143c\u0000", new Object[] { "c", "b", aopo.class });
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
