import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifb extends ahcz implements aheo
{
    public static final aifb a;
    private static volatile ahev x;
    private ahjl A;
    private byte B;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    public akfj g;
    public ajws h;
    public String i;
    public aifa j;
    public aisc k;
    public aisc l;
    public akfj m;
    public ajws n;
    public String o;
    public aisc p;
    public aifc q;
    public ahkc r;
    public ahkc s;
    public String t;
    public boolean u;
    public aisc v;
    public ahbt w;
    private aisc y;
    private aisc z;
    
    static {
        ahcz.registerDefaultInstance(aifb.class, a = new aifb());
    }
    
    private aifb() {
        this.c = 0;
        this.B = 2;
        this.i = "";
        this.o = "";
        this.t = "";
        this.w = ahbt.b;
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
                final ahev x;
                if ((x = aifb.x) == null) {
                    synchronized (aifb.class) {
                        if (aifb.x == null) {
                            aifb.x = (ahev)new ahcs((ahcz)aifb.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return aifb.a;
            }
            case 4: {
                return new ahcr((ahcz)aifb.a);
            }
            case 3: {
                return new aifb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifb.a, "\u0001\u0018\u0001\u0001\u0001\u001d\u0018\u0000\u0000\f\u0001\u103c\u0000\u0003\u1007\u0003\u0004\u1007\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\t\b\u1409\f\t\u1409\r\n\u1409\u000f\f\u1409\u001a\r\u100a\u001b\u000e\u1008\u0007\u000f\u1008\u000e\u0010\u1009\u0011\u0011\u1409\n\u0012\u1409\b\u0013\u1009\u0014\u0014\u1009\u0015\u0017\u103c\u0000\u0018\u1008\u0017\u001a\u1007\u0018\u001b\u1409\u0019\u001c\u1409\u000b\u001d\u1409\u0010", new Object[] { "d", "c", "b", aifc.class, "e", "f", "g", "h", "k", "m", "n", "p", "A", "w", "i", "o", "q", "l", "j", "r", "s", aier.class, "t", "u", "v", "y", "z" });
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
