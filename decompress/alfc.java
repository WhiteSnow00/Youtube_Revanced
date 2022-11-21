import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfc extends ahcz implements aheo
{
    public static final alfc a;
    private static volatile ahev r;
    public int b;
    public aknj c;
    public ahdp d;
    public anxb e;
    public apop f;
    public boolean g;
    public int h;
    public aisc i;
    public String j;
    public alfb k;
    public alfa l;
    public amjt m;
    public aisc n;
    public boolean o;
    public alfd p;
    public ahbt q;
    private ajxn s;
    private ahjl t;
    private byte u;
    
    static {
        ahcz.registerDefaultInstance(alfc.class, a = new alfc());
    }
    
    private alfc() {
        this.u = 2;
        this.d = ahcz.emptyProtobufList();
        this.j = "";
        this.q = ahbt.b;
    }
    
    public final void a() {
        final ahdp d = this.d;
        if (!d.c()) {
            this.d = ahcz.mutableCopy(d);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = alfc.r) == null) {
                    synchronized (alfc.class) {
                        if (alfc.r == null) {
                            alfc.r = (ahev)new ahcs((ahcz)alfc.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return alfc.a;
            }
            case 4: {
                return new ahcr((float[])null, (char[][])null);
            }
            case 3: {
                return new alfc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfc.a, "\u0001\u0011\u0000\u0001\u0001\u0309\u0011\u0000\u0001\n\u0001\u1409\u0000\u0003\u041b\u0004\u1409\u0002\u0005\u1007\u0003\u0006\u1004\u0004\u0007\u1409\u0005\b\u1009\t\t\u1008\u0006\n\u1409\n\u000b\u1007\u000b\f\u1409\u000e\r\u100a\u000f\u000e\u1409\u0001\u000f\u1409\f\u0010\u1009\b\u0011\u1409\u0007\u0309\u1409\r", new Object[] { "b", "c", "d", alfd.class, "f", "g", "h", "i", "m", "j", "n", "o", "t", "q", "e", "p", "l", "k", "s" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
