import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyv extends ahcz implements aheo
{
    public static final akyv a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyv.class, a = new akyv());
    }
    
    private akyv() {
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
                if ((d = akyv.d) == null) {
                    synchronized (akyv.class) {
                        if (akyv.d == null) {
                            akyv.d = (ahev)new ahcs((ahcz)akyv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyv.a;
            }
            case 4: {
                return new ahcr((ahcz)akyv.a);
            }
            case 3: {
                return new akyv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyv.a, "\u0001\u0001\u0001\u0000\uf608\u3e57\uf608\u3e57\u0001\u0000\u0000\u0001\uf608\u3e57\u143c\u0000", new Object[] { "c", "b", anao.class });
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
