import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anst extends ahcz implements aheo
{
    public static final anst a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(anst.class, a = new anst());
    }
    
    private anst() {
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
                if ((d = anst.d) == null) {
                    synchronized (anst.class) {
                        if (anst.d == null) {
                            anst.d = (ahev)new ahcs((ahcz)anst.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anst.a;
            }
            case 4: {
                return new ahcr((ahcz)anst.a);
            }
            case 3: {
                return new anst();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anst.a, "\u0001\u0003\u0001\u0000\uff43\u1dfd\ue862\u4b1e\u0003\u0000\u0000\u0003\uff43\u1dfd\u143c\u0000\ueb11\u1f11\u143c\u0000\ue862\u4b1e\u143c\u0000", new Object[] { "c", "b", answ.class, aies.class, ahmt.class });
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
