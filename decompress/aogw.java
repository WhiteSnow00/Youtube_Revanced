import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogw extends ahcz implements aheo
{
    public static final aogw a;
    private static volatile ahev j;
    public int b;
    public String c;
    public aowb d;
    public String e;
    public aogv f;
    public String g;
    public aisc h;
    public boolean i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aogw.class, a = new aogw());
    }
    
    private aogw() {
        this.k = 2;
        this.c = "";
        this.e = "";
        this.g = "";
        this.i = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aogw.j) == null) {
                    synchronized (aogw.class) {
                        if (aogw.j == null) {
                            aogw.j = (ahev)new ahcs((ahcz)aogw.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aogw.a;
            }
            case 4: {
                return new ahcr((ahcz)aogw.a);
            }
            case 3: {
                return new aogw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogw.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0005\u1009\u0004\u0006\u1008\u0005\u0007\u1409\u0006\b\u1007\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
