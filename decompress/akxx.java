import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxx extends ahcz implements aheo
{
    public static final akxx a;
    private static volatile ahev l;
    public int b;
    public int c;
    public Object d;
    public aknh e;
    public ahbt f;
    public ahbt g;
    public ahbt h;
    public boolean i;
    public String j;
    public int k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akxx.class, a = new akxx());
    }
    
    private akxx() {
        this.c = 0;
        this.m = 2;
        this.f = ahbt.b;
        final ahbt b = ahbt.b;
        this.g = b;
        this.h = b;
        this.j = "";
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
                if ((l = akxx.l) == null) {
                    synchronized (akxx.class) {
                        if (akxx.l == null) {
                            akxx.l = (ahev)new ahcs((ahcz)akxx.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return akxx.a;
            }
            case 4: {
                return new ahcr((ahcz)akxx.a);
            }
            case 3: {
                return new akxx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxx.a, "\u0001\t\u0001\u0001\u0001\u0010\t\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u103d\u0000\u0005\u100a\u0003\u0006\u100a\u0001\u0007\u100a\u0002\b\u1007\u0004\t\u1008\u0006\f\u100c\u000b\u0010\u103d\u0000", new Object[] { "d", "c", "b", "e", "h", "f", "g", "i", "j", "k", akyi.b });
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
