import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiv extends ahcz implements aheo
{
    public static final amiv a;
    private static volatile ahev n;
    public int b;
    public ahdp c;
    public amjb d;
    public amin e;
    public boolean f;
    public String g;
    public amiq h;
    public ahkc i;
    public boolean j;
    public boolean k;
    public boolean l;
    public aisc m;
    private ahjl o;
    private aisc p;
    private anxb q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(amiv.class, a = new amiv());
    }
    
    private amiv() {
        this.r = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
        this.g = "";
    }
    
    public final void a() {
        final ahdp c = this.c;
        if (!c.c()) {
            this.c = ahcz.mutableCopy(c);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = amiv.n) == null) {
                    synchronized (amiv.class) {
                        if (amiv.n == null) {
                            amiv.n = (ahev)new ahcs((ahcz)amiv.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return amiv.a;
            }
            case 4: {
                return new ahcr((short[][])null, (byte[])null);
            }
            case 3: {
                return new amiv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amiv.a, "\u0001\u000e\u0000\u0001\u0001\u0015\u000e\u0000\u0001\b\u0001\u041b\u0003\u1409\u0000\u0005\u1409\u0002\u0007\u1409\u0003\b\u1007\u0004\t\u1409\u0007\n\u1009\b\u000b\u1008\u0006\u000e\u1007\u000b\u000f\u1409\n\u0011\u1409\u000e\u0012\u1007\r\u0013\u1007\u0010\u0015\u1409\u0011", new Object[] { "b", "c", amis.class, "o", "d", "e", "f", "h", "i", "g", "j", "p", "q", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
