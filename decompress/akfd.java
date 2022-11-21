import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfd extends ahcz implements aheo
{
    public static final akfd a;
    private static volatile ahev m;
    public int b;
    public String c;
    public aisc d;
    public akfj e;
    public String f;
    public boolean g;
    public int h;
    public aisc i;
    public ahkb j;
    public String k;
    public ahbt l;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(akfd.class, a = new akfd());
    }
    
    private akfd() {
        this.o = 2;
        this.c = "";
        this.f = "";
        this.k = "";
        this.l = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = akfd.m) == null) {
                    synchronized (akfd.class) {
                        if (akfd.m == null) {
                            akfd.m = (ahev)new ahcs((ahcz)akfd.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akfd.a;
            }
            case 4: {
                return new ahcr((ahcz)akfd.a);
            }
            case 3: {
                return new akfd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfd.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u100c\u0005\u0004\u1409\u0006\u0005\u1409\t\u0006\u100a\n\u0007\u1008\u0003\b\u1007\u0004\t\u1008\b\n\u1009\u0007\u000b\u1409\u0001", new Object[] { "b", "c", "e", "h", akan.t, "i", "n", "l", "f", "g", "k", "j", "d" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
