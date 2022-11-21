import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auby extends ahcz implements aheo
{
    public static final auby a;
    private static volatile ahev e;
    public int b;
    public long c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(auby.class, a = new auby());
    }
    
    private auby() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = auby.e) == null) {
                    synchronized (auby.class) {
                        if (auby.e == null) {
                            auby.e = (ahev)new ahcs((ahcz)auby.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return auby.a;
            }
            case 4: {
                return new ahcr((ahcz)auby.a);
            }
            case 3: {
                return new auby();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)auby.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1002\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", areg.u });
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
