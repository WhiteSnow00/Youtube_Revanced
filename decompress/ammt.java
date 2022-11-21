import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammt extends ahcz implements aheo
{
    public static final ammt a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ammt.class, a = new ammt());
    }
    
    private ammt() {
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
                if ((d = ammt.d) == null) {
                    synchronized (ammt.class) {
                        if (ammt.d == null) {
                            ammt.d = (ahev)new ahcs((ahcz)ammt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammt.a;
            }
            case 4: {
                return new ahcr((ahcz)ammt.a);
            }
            case 3: {
                return new ammt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammt.a, "\u0001\u0001\u0001\u0000\ueb08\u32d6\ueb08\u32d6\u0001\u0000\u0000\u0001\ueb08\u32d6\u143c\u0000", new Object[] { "c", "b", ammu.class });
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
