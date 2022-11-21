import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlc extends ahcz implements aheo
{
    public static final amlc a;
    private static volatile ahev d;
    public int b;
    public amkz c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amlc.class, a = new amlc());
    }
    
    private amlc() {
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
                if ((d = amlc.d) == null) {
                    synchronized (amlc.class) {
                        if (amlc.d == null) {
                            amlc.d = (ahev)new ahcs((ahcz)amlc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlc.a;
            }
            case 4: {
                return new ahcr((ahcz)amlc.a);
            }
            case 3: {
                return new amlc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlc.a, "\u0001\u0001\u0000\u0001\ufa18\u3c15\ufa18\u3c15\u0001\u0000\u0000\u0001\ufa18\u3c15\u1409\u0000", new Object[] { "b", "c" });
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
