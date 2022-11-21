import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitt extends ahcz implements aheo
{
    public static final aitt a;
    private static volatile ahev b;
    private int c;
    private aits d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aitt.class, a = new aitt());
    }
    
    private aitt() {
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
                if ((b = aitt.b) == null) {
                    synchronized (aitt.class) {
                        if (aitt.b == null) {
                            aitt.b = (ahev)new ahcs((ahcz)aitt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aitt.a;
            }
            case 4: {
                return new ahcr((ahcz)aitt.a);
            }
            case 3: {
                return new aitt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitt.a, "\u0001\u0001\u0000\u0001\ue535\u454e\ue535\u454e\u0001\u0000\u0000\u0001\ue535\u454e\u1409\u0000", new Object[] { "c", "d" });
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
