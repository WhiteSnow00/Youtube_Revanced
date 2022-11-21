import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptc extends ahcz implements aheo
{
    public static final aptc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aptc.class, a = new aptc());
    }
    
    private aptc() {
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
                if ((d = aptc.d) == null) {
                    synchronized (aptc.class) {
                        if (aptc.d == null) {
                            aptc.d = (ahev)new ahcs((ahcz)aptc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptc.a;
            }
            case 4: {
                return new ahcr((ahcz)aptc.a);
            }
            case 3: {
                return new aptc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptc.a, "\u0001\u0001\u0001\u0000\ufd29\u49e2\ufd29\u49e2\u0001\u0000\u0000\u0001\ufd29\u49e2\u143c\u0000", new Object[] { "c", "b", aptb.class });
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
