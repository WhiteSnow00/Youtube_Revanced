import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiff extends ahcz implements aheo
{
    public static final aiff a;
    private static volatile ahev d;
    public int b;
    public aife c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiff.class, a = new aiff());
    }
    
    private aiff() {
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
                if ((d = aiff.d) == null) {
                    synchronized (aiff.class) {
                        if (aiff.d == null) {
                            aiff.d = (ahev)new ahcs((ahcz)aiff.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiff.a;
            }
            case 4: {
                return new ahcr((ahcz)aiff.a);
            }
            case 3: {
                return new aiff();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiff.a, "\u0001\u0001\u0000\u0001\uf1ff\u450b\uf1ff\u450b\u0001\u0000\u0000\u0001\uf1ff\u450b\u1409\u0000", new Object[] { "b", "c" });
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
