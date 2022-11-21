import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyw extends ahcz implements aheo
{
    public static final akyw a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyw.class, a = new akyw());
    }
    
    private akyw() {
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
                if ((d = akyw.d) == null) {
                    synchronized (akyw.class) {
                        if (akyw.d == null) {
                            akyw.d = (ahev)new ahcs((ahcz)akyw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyw.a;
            }
            case 4: {
                return new ahcr((ahcz)akyw.a);
            }
            case 3: {
                return new akyw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyw.a, "\u0001\u0001\u0001\u0000\ue56e\u484e\ue56e\u484e\u0001\u0000\u0000\u0001\ue56e\u484e\u143c\u0000", new Object[] { "c", "b", andp.class });
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
