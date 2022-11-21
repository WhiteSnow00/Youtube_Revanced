import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhr extends ahcz implements aheo
{
    public static final alhr a;
    private static volatile ahev l;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public ajws f;
    public akfj g;
    public boolean h;
    public aisc i;
    public anxb j;
    public anxb k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(alhr.class, a = new alhr());
    }
    
    private alhr() {
        this.c = 0;
        this.m = 2;
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
                if ((l = alhr.l) == null) {
                    synchronized (alhr.class) {
                        if (alhr.l == null) {
                            alhr.l = (ahev)new ahcs((ahcz)alhr.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return alhr.a;
            }
            case 4: {
                return new ahcr((ahcz)alhr.a);
            }
            case 3: {
                return new alhr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhr.a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u103b\u0000\u0003\u1037\u0000\u0004\u1409\u0004\u0005\u1007\u0005\u0007\u1409\u0001\b\u1409\u0007\t\u1409\b\n\u1409\t", new Object[] { "d", "c", "b", "e", "g", "h", "f", "i", "j", "k" });
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
