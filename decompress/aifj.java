import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifj extends ahcz implements aheo
{
    public static final aifj a;
    private static volatile ahev d;
    public int b;
    public aijh c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifj.class, a = new aifj());
    }
    
    private aifj() {
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
                if ((d = aifj.d) == null) {
                    synchronized (aifj.class) {
                        if (aifj.d == null) {
                            aifj.d = (ahev)new ahcs((ahcz)aifj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifj.a;
            }
            case 4: {
                return new ahcr((ahcz)aifj.a);
            }
            case 3: {
                return new aifj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifj.a, "\u0001\u0001\u0000\u0001\uf601\u18c7\uf601\u18c7\u0001\u0000\u0000\u0001\uf601\u18c7\u1409\u0000", new Object[] { "b", "c" });
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
