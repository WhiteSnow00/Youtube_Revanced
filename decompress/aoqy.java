import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqy extends ahcz implements aheo
{
    public static final aoqy a;
    private static volatile ahev o;
    public int b;
    public ahdp c;
    public aisc d;
    public anxb e;
    public aisc f;
    public boolean g;
    public ahos h;
    public ahng i;
    public ahbt j;
    public int k;
    public boolean l;
    public ahdp m;
    public ahdp n;
    private ahjl p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(aoqy.class, a = new aoqy());
    }
    
    private aoqy() {
        this.q = 2;
        this.c = ahcz.emptyProtobufList();
        this.j = ahbt.b;
        this.m = ahcz.emptyProtobufList();
        this.n = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = aoqy.o) == null) {
                    synchronized (aoqy.class) {
                        if (aoqy.o == null) {
                            aoqy.o = (ahev)new ahcs((ahcz)aoqy.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aoqy.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqy.a);
            }
            case 3: {
                return new aoqy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqy.a, "\u0001\r\u0000\u0001\u0001\u0019\r\u0000\u0003\u0007\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1007\u0003\u0006\u1409\u0004\u0007\u1009\u0005\b\u1409\u0006\t\u100a\u0007\n\u100c\b\u000b\u1007\t\f\u041b\u0019\u001b", new Object[] { "b", "c", aora.class, "d", "e", "f", "g", "h", "i", "p", "j", "k", aoqv.a(), "l", "n", aowb.class, "m", aoqw.class });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
