import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apto extends ahcz implements aheo
{
    public static final apto a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apto.class, a = new apto());
    }
    
    private apto() {
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
                if ((d = apto.d) == null) {
                    synchronized (apto.class) {
                        if (apto.d == null) {
                            apto.d = (ahev)new ahcs((ahcz)apto.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apto.a;
            }
            case 4: {
                return new ahcr((ahcz)apto.a);
            }
            case 3: {
                return new apto();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apto.a, "\u0001\u0003\u0001\u0000\uf03a\u2b94\ue496\u3d35\u0003\u0000\u0000\u0003\uf03a\u2b94\u143c\u0000\ufb65\u31c3\u143c\u0000\ue496\u3d35\u143c\u0000", new Object[] { "c", "b", aicl.class, aicj.class, amjs.class });
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
