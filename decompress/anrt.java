import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anrt extends ahcz implements aheo
{
    private static volatile ahev A;
    public static final anrt a;
    private byte B;
    public int b;
    public aowb c;
    public aowb d;
    public anxb e;
    public akfj f;
    public ajws g;
    public ajws h;
    public float i;
    public ajws j;
    public ajws k;
    public ajws l;
    public anxb m;
    public long n;
    public anxb o;
    public boolean p;
    public aisc q;
    public ahdp r;
    public anxb s;
    public long t;
    public aidv u;
    public ahdp v;
    public boolean w;
    public anrh x;
    public anrr y;
    public boolean z;
    
    static {
        ahcz.registerDefaultInstance(anrt.class, a = new anrt());
    }
    
    private anrt() {
        this.B = 2;
        this.r = ahcz.emptyProtobufList();
        this.v = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte b = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev a2;
                if ((a2 = anrt.A) == null) {
                    synchronized (anrt.class) {
                        if (anrt.A == null) {
                            anrt.A = (ahev)new ahcs((ahcz)anrt.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return anrt.a;
            }
            case 4: {
                return new ahcr((ahcz)anrt.a);
            }
            case 3: {
                return new anrt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anrt.a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0002\u000f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1001\u0006\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000f\f\u041b\r\u1409\u0010\u000e\u1002\u0011\u000f\u1009\u0012\u0010\u041b\u0011\u1007\u0013\u0012\u1409\u000b\u0014\u1009\u0015\u0015\u1009\u0016\u0018\u1007\u0018\u0019\u1409\r\u001a\u1002\f\u001b\u1007\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "q", "r", aisc.class, "s", "t", "u", "v", aisc.class, "w", "m", "x", "y", "z", "o", "n", "p" });
            }
            case 1: {
                if (o == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
