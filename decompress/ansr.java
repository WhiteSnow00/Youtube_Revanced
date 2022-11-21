import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansr extends ahcz implements aheo
{
    public static final ansr a;
    private static volatile ahev q;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public akfj f;
    public aowb g;
    public aisc h;
    public ahdp i;
    public amiy j;
    public ansq k;
    public long l;
    public long m;
    public ahof n;
    public ahbt o;
    public String p;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(ansr.class, a = new ansr());
    }
    
    private ansr() {
        this.s = 2;
        this.i = ahcz.emptyProtobufList();
        this.o = ahbt.b;
        this.p = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev q;
                if ((q = ansr.q) == null) {
                    synchronized (ansr.class) {
                        if (ansr.q == null) {
                            ansr.q = (ahev)new ahcs((ahcz)ansr.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return ansr.a;
            }
            case 4: {
                return new ahcr((ahcz)ansr.a);
            }
            case 3: {
                return new ansr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansr.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u041b\b\u1409\u0006\t\u1409\u000b\n\u100a\f\u000b\u1009\u0007\f\u1002\b\r\u1002\t\u000e\u1409\n\u000f\u1008\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", aisc.class, "j", "r", "o", "k", "l", "m", "n", "p" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
