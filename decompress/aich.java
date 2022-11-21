import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aich extends ahcz implements aheo
{
    public static final aich a;
    private static volatile ahev g;
    public int b;
    public aicl c;
    public aicj d;
    public aici e;
    public amjs f;
    private aicn h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aich.class, a = new aich());
    }
    
    private aich() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aich.g) == null) {
                    synchronized (aich.class) {
                        if (aich.g == null) {
                            aich.g = (ahev)new ahcs((ahcz)aich.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aich.a;
            }
            case 4: {
                return new ahcr((ahcz)aich.a);
            }
            case 3: {
                return new aich();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aich.a, "\u0001\u0005\u0000\u0001\ue5d8\u1848\ue496\u3d35\u0005\u0000\u0000\u0005\ue5d8\u1848\u1409\u0004\uf03a\u2b94\u1409\u0000\ufb65\u31c3\u1409\u0001\ue5b3\u31ca\u1409\u0002\ue496\u3d35\u1409\u0003", new Object[] { "b", "h", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
