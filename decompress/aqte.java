import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqte extends ahcz implements aheo
{
    public static final aqte a;
    private static volatile ahev r;
    public int b;
    public long c;
    public ahej d;
    public zdq e;
    public int f;
    public String g;
    public ahej h;
    public int i;
    public int j;
    public long k;
    public String l;
    public boolean m;
    public boolean n;
    public aqtb o;
    public aqtb p;
    public int q;
    
    static {
        ahcz.registerDefaultInstance(aqte.class, a = new aqte());
    }
    
    private aqte() {
        this.d = ahej.a;
        this.h = ahej.a;
        this.c = -1L;
        this.g = "";
        this.l = "";
    }
    
    public final ahej a() {
        final ahej d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
    }
    
    public final ahej b() {
        final ahej h = this.h;
        if (!h.b) {
            this.h = h.a();
        }
        return this.h;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = aqte.r) == null) {
                    synchronized (aqte.class) {
                        if (aqte.r == null) {
                            aqte.r = (ahev)new ahcs((ahcz)aqte.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aqte.a;
            }
            case 4: {
                return new ahcr((int[][][])null, (char[][][])null);
            }
            case 3: {
                return new aqte();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqte.a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0002\u0000\u0000\u0001\u1002\u0000\u00022\u0003\u1009\u0001\u0004\u1004\u0002\u0005\u1008\u0003\n2\u000b\u100c\u0004\f\u100c\u0005\r\u1002\u0006\u000e\u1008\u0007\u000f\u1007\b\u0011\u1007\t\u0012\u1009\n\u0013\u1009\u000b\u0014\u1004\f", new Object[] { "b", "c", "d", aqtc.a, "e", "f", "g", "h", aqtd.a, "i", apqo.a(), "j", apqo.a(), "k", "l", "m", "n", "o", "p", "q" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
