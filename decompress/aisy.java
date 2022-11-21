import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisy extends ahcz implements aheo
{
    public static final aisy a;
    private static volatile ahev l;
    public int b;
    public int c;
    public Object d;
    public String e;
    public aisc f;
    public aisc g;
    public String h;
    public aisc i;
    public boolean j;
    public boolean k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(aisy.class, a = new aisy());
    }
    
    private aisy() {
        this.c = 0;
        this.m = 2;
        this.e = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aisy.l) == null) {
                    synchronized (aisy.class) {
                        if (aisy.l == null) {
                            aisy.l = (ahev)new ahcs((ahcz)aisy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aisy.a;
            }
            case 4: {
                return new ahcr((ahcz)aisy.a);
            }
            case 3: {
                return new aisy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisy.a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u103b\u0000\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1008\u0005\t\u1409\u0006\n\u1007\u0007\u000b\u1007\b", new Object[] { "d", "c", "b", "e", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
