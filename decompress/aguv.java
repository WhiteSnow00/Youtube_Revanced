import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguv extends ahcz implements aheo
{
    public static final aguv a;
    private static volatile ahev d;
    public int b;
    public agux c;
    
    static {
        ahcz.registerDefaultInstance(aguv.class, a = new aguv());
    }
    
    private aguv() {
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
                if ((d = aguv.d) == null) {
                    synchronized (aguv.class) {
                        if (aguv.d == null) {
                            aguv.d = (ahev)new ahcs((ahcz)aguv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aguv.a;
            }
            case 4: {
                return new ahcr((ahcz)aguv.a);
            }
            case 3: {
                return new aguv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguv.a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\t", new Object[] { "b", "c" });
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
