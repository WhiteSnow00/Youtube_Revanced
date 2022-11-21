import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvp extends ahcz implements aheo
{
    public static final apvp a;
    private static volatile ahev v;
    public int b;
    public String c;
    public String d;
    public float e;
    public float f;
    public double g;
    public apvo h;
    public ahbt i;
    public ahbt j;
    public int k;
    public float l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public String t;
    public String u;
    
    static {
        ahcz.registerDefaultInstance(apvp.class, a = new apvp());
    }
    
    private apvp() {
        this.c = "";
        this.d = "";
        this.i = ahbt.b;
        this.j = ahbt.b;
        this.l = 1.0f;
        this.t = "";
        this.u = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev v;
                if ((v = apvp.v) == null) {
                    synchronized (apvp.class) {
                        if (apvp.v == null) {
                            apvp.v = (ahev)new ahcs((ahcz)apvp.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return apvp.a;
            }
            case 4: {
                return new ahcr((ahcz)apvp.a);
            }
            case 3: {
                return new apvp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvp.a, "\u0001\u0013\u0000\u0001\u0001\u001a\u0013\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1009\u0005\u0006\u1001\t\u0007\u100c\n\b\u100c\u000b\t\u1004\f\n\u1007\r\u000b\u1007\u000e\f\u1007\u000f\r\u1002\u0010\u000e\u100c\b\u000f\u1008\u0011\u0010\u1008\u0012\u0011\u1000\u0004\u0013\u100a\u0006\u001a\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "h", "l", "m", ainu.a(), "n", apvm.b, "o", "p", "q", "r", "s", "k", apvn.a(), "t", "u", "g", "i", "j" });
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
