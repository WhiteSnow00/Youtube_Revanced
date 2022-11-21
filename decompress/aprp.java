import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprp extends ahcu implements ahcv
{
    private static volatile ahev B;
    public static final aprp a;
    public anxb A;
    private aisc C;
    private ahjl D;
    private aich E;
    private aisc F;
    private byte G;
    public int b;
    public ajws c;
    public ajws d;
    public aowb e;
    public ajws f;
    public ails g;
    public ajws h;
    public ajws i;
    public ajws j;
    public aisc k;
    public apro m;
    public amiy n;
    public boolean o;
    public ahdp p;
    public ahbt q;
    public String r;
    public aich s;
    public aich t;
    public ajws u;
    public apie v;
    public ahdp w;
    public aprq x;
    public apne y;
    public anxb z;
    
    static {
        ahcz.registerDefaultInstance(aprp.class, (ahcz)(a = new aprp()));
    }
    
    private aprp() {
        this.G = 2;
        this.p = emptyProtobufList();
        this.q = ahbt.b;
        this.r = "";
        this.w = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aprp.B) == null) {
                    synchronized (aprp.class) {
                        if (aprp.B == null) {
                            aprp.B = (ahev)new ahcs((ahcz)aprp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprp.a;
            }
            case 4: {
                return new ahct((ahcu)aprp.a);
            }
            case 3: {
                return new aprp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprp.a, "\u0001\u001c\u0000\u0001\u0001\"\u001c\u0000\u0002\u0017\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\t\b\u1409\n\t\u1409\u000b\n\u1007\f\f\u1409\u0010\r\u100a\u0012\u000e\u1008\u0013\u000f\u041b\u0010\u1409\u0005\u0011\u1409\u0014\u0012\u1409\u0015\u0013\u1409\u0016\u0014\u1409\u0017\u0015\u1409\b\u0017\u1409\u0018\u0019\u041b\u001a\u1009\u001a\u001b\u1009\u001b\u001d\u1409\u001c\u001f\u1409\u001e \u1409\u001f\"\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "h", "i", "k", "m", "n", "o", "D", "q", "r", "p", aovp.class, "g", "E", "s", "t", "u", "j", "v", "w", aibx.class, "x", "y", "z", "F", "A", "C" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.G = g;
                return null;
            }
            case 0: {
                return this.G;
            }
        }
    }
}
