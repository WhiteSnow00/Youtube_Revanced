import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlj extends ahcz implements aheo
{
    public static final amlj a;
    private static volatile ahev d;
    public int b;
    public aies c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amlj.class, a = new amlj());
    }
    
    private amlj() {
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
                if ((d = amlj.d) == null) {
                    synchronized (amlj.class) {
                        if (amlj.d == null) {
                            amlj.d = (ahev)new ahcs((ahcz)amlj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amlj.a;
            }
            case 4: {
                return new ahcr((ahcz)amlj.a);
            }
            case 3: {
                return new amlj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amlj.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
