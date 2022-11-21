import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptr extends ahcz implements aheo
{
    public static final aptr a;
    private static volatile ahev o;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public ajws f;
    public ajws g;
    public aisc h;
    public ahdp i;
    public ahdp j;
    public int k;
    public amiy l;
    public String m;
    public ahbt n;
    private apie p;
    private anxb q;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(aptr.class, a = new aptr());
    }
    
    private aptr() {
        this.s = 2;
        this.i = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
        this.m = "";
        this.n = ahbt.b;
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
                final ahev o3;
                if ((o3 = aptr.o) == null) {
                    synchronized (aptr.class) {
                        if (aptr.o == null) {
                            aptr.o = (ahev)new ahcs((ahcz)aptr.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aptr.a;
            }
            case 4: {
                return new ahcr((ahcz)aptr.a);
            }
            case 3: {
                return new aptr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptr.a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0006\u0006\u1409\r\u0007\u100a\u000e\t\u041b\n\u041b\u000b\u100c\b\f\u1409\t\r\u1008\n\u000e\u1409\u0003\u000f\u1409\u0005\u0010\u1409\u000b", new Object[] { "b", "c", "d", "e", "g", "h", "r", "n", "i", aovp.class, "j", apto.class, "k", aprh.r, "l", "m", "f", "p", "q" });
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
