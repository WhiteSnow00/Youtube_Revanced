import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyq extends ahcz implements aheo
{
    public static final akyq a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyq.class, a = new akyq());
    }
    
    private akyq() {
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
                if ((d = akyq.d) == null) {
                    synchronized (akyq.class) {
                        if (akyq.d == null) {
                            akyq.d = (ahev)new ahcs((ahcz)akyq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyq.a;
            }
            case 4: {
                return new ahcr((ahcz)akyq.a);
            }
            case 3: {
                return new akyq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyq.a, "\u0001\u0001\u0001\u0000\uf74e\u1ed4\uf74e\u1ed4\u0001\u0000\u0000\u0001\uf74e\u1ed4\u143c\u0000", new Object[] { "c", "b", aiak.class });
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
