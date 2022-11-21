import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anve extends ahcz implements aheo
{
    public static final anve a;
    private static volatile ahev j;
    public int b;
    public int c;
    public Object d;
    public aowb e;
    public aisc f;
    public ahbt g;
    public ajws h;
    public String i;
    private ahjl k;
    private ajws l;
    private aisc m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(anve.class, a = new anve());
    }
    
    private anve() {
        this.c = 0;
        this.n = 2;
        this.g = ahbt.b;
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = anve.j) == null) {
                    synchronized (anve.class) {
                        if (anve.j == null) {
                            anve.j = (ahev)new ahcs((ahcz)anve.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anve.a;
            }
            case 4: {
                return new ahcr((ahcz)anve.a);
            }
            case 3: {
                return new anve();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anve.a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u143c\u0000\b\u103b\u0000\t\u1008\t\n\u1409\n\u000b\u1409\u000b", new Object[] { "d", "c", "b", "e", "f", "g", "k", "h", akfj.class, "i", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
