import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisi extends ahcz implements aheo
{
    public static final aisi a;
    private static volatile ahev d;
    public int b;
    public aish c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aisi.class, a = new aisi());
    }
    
    private aisi() {
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
                if ((d = aisi.d) == null) {
                    synchronized (aisi.class) {
                        if (aisi.d == null) {
                            aisi.d = (ahev)new ahcs((ahcz)aisi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aisi.a;
            }
            case 4: {
                return new ahcr((ahcz)aisi.a);
            }
            case 3: {
                return new aisi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisi.a, "\u0001\u0001\u0000\u0001\uf1ab\u1fd3\uf1ab\u1fd3\u0001\u0000\u0000\u0001\uf1ab\u1fd3\u1409\u0000", new Object[] { "b", "c" });
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
