import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezm extends ahcz implements aheo
{
    public static final aezm a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(aezm.class, a = new aezm());
    }
    
    private aezm() {
        this.c = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aezm.d) == null) {
                    synchronized (aezm.class) {
                        if (aezm.d == null) {
                            aezm.d = (ahev)new ahcs((ahcz)aezm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aezm.a;
            }
            case 4: {
                return new ahcr((ahcz)aezm.a);
            }
            case 3: {
                return new aezm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aezm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
