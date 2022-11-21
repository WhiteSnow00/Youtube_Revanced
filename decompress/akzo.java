import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzo extends ahcz implements aheo
{
    public static final akzo a;
    private static volatile ahev o;
    public int b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String l;
    public aowb m;
    public String n;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(akzo.class, a = new akzo());
    }
    
    private akzo() {
        this.p = 2;
        this.c = "";
        this.d = "";
        ahcz.emptyProtobufList();
        this.l = "";
        this.n = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = akzo.o) == null) {
                    synchronized (akzo.class) {
                        if (akzo.o == null) {
                            akzo.o = (ahev)new ahcs((ahcz)akzo.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return akzo.a;
            }
            case 4: {
                return new ahcr((ahcz)akzo.a);
            }
            case 3: {
                return new akzo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzo.a, "\u0001\f\u0000\u0001\u0001*\f\u0000\u0000\u0001\u0001\u1008\u0000\u000f\u1008\u0001\u0010\u1003\u0002\u0011\u1007\u0003\u0013\u1008\r\u0018\u1007\t\u0019\u1409\u0012\u001b\u1007\u0007\u001d\u1004\f!\u1008\u0016'\u100c\u000b*\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "l", "i", "m", "h", "k", "n", "j", amew.a(), "g" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
